/* Name: Manali Milind Pandit
 * NUId: 001852743 
 */

package edu.neu.csye6200.train;


	import java.util.*;
	import java.util.HashMap;
	public class Train {		 

		static Scanner sc = new Scanner(System.in);


		private static ArrayList<Car> trainlist = new ArrayList<Car>();  //Declared an ArrayList

		private static HashMap<String, String> myMap = new HashMap<String, String>();




		public void railcarlist() {		//Declared a method to add the RailCar instances to the list

			add(new Car("Germany","Railway Plough",50,"MP3108", 75, 1000,80));			//Instances of class Rail car
			add(new Car("Renault","Autorail",60,"HP2604",85,200,90));
			add(new Car("US","Troop Sleeper",80,"SK2502", 95, 600,100));
			list();


		}	

		private void add(Car car) {
			trainlist.add(car);
		}


		private void list() {		//Method to print the entire list of the RailCar instances
			for ( Car car: trainlist)
				System.out.println(car);


		}

		private void addition() {		//Method to add any new RailCar instance to the list
			System.out.println("Enter owner name");
			String owner = sc.next();

			System.out.println("Enter type");
			String type = sc.next();

			System.out.println("Enter minimum weight wt");
			int minweight = sc.nextInt();

			System.out.println("Enter Car Id");
			String car_id = sc.next();

			for (int i = 0; i<trainlist.size(); i++)
			{
				if(trainlist.get(i).car_id.contains(car_id))		//Match the entered car id to all the car id's in the list and and prompt the user if it already exists. 
				{
					System.out.println("Entered Car Id already exits. ");		
					System.exit(0);
					//list();
					addition();
				}
			}

			System.out.println("Enter cargo weight");
			int cargo_wt = sc.nextInt();

			System.out.println("Enter maximum wt");
			int maxweight = sc.nextInt();

			System.out.println("Enter velocity");
			int velocity = sc.nextInt();



			trainlist.add(new Car(owner, type, minweight, car_id, cargo_wt, maxweight, velocity));		//Add the new RailCar instance to the list
			list();		//Print the list with the updated entries
			myMap.put(car_id, owner);		//Map the new entry



		}

		private void remove() {		//Method to remove any RailCar instance
			System.out.println("Enter the Car Id which value you want to remove");
			String input = sc.next();
			for (int i = 0; i<trainlist.size(); i++)
			{
				trainlist.get(i);
				if(trainlist.get(i).car_id.contains(input))		//Checks if the entered car id is in the list 
				{
					trainlist.remove(i);
					myMap.remove(input);		//Removes the removed entry's mapping from the Hash Map
					list();
				}
			}


		}

		public void get()
		{
			System.out.println("Enter the record you want to print");
			int i = sc.nextInt();
			System.out.println(trainlist.get(i-1));		//Access and print the instance by the index value of the record



		}

		public Train() {		//Mapping of the Car Id to the Owner's name using Hash Map 
		
			myMap.put("MP3108", "Germany");
			myMap.put("HP2604", "Renault");
			myMap.put("SK2502","US");

	}

		private void retrieve() {		//To retrieve the owner's information by its Car id
			System.out.println("Enter the Car id");
			String userin = sc.next();
			if(myMap.containsKey(userin));
			System.out.println("Owner " + myMap.get(userin));





		}


		public static void main(String[] args)
		{
			Train tr = new Train();

			tr.railcarlist();

			while(true)
			{
				System.out.println("\n"+"Enter the choice" + "\n"+ "1) To add Rail car Instance" + "\n" + "2) To Remove any Rail car instance" + "\n" + "3) To access any of the Rail car instance" + "\n" + "4) To List all of the Rail car instances" + "\n" + "5) To retieve any Rail car instance");
				int ch = sc.nextInt();
				switch(ch)


				{
				case 1:
					tr.addition();
					break;
				case 2:
					tr.remove(); 
					break;
				case 3:
					tr.get(); 
					break;
				case 4:
					tr.list();
					break;
				case 5:
					tr.retrieve();


				}	

			}
		}


	}

