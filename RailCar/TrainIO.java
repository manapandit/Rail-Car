/* Name: Manali Milind Pandit
 * NUId: 001852743 
 */

package edu.neu.csye6200.train;

	import java.io.FileNotFoundException;

	import java.io.FileReader;

	

	import java.io.FileWriter;

	import java.io.IOException;
	import java.util.logging.FileHandler;
	import java.util.logging.Handler;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	//import java.util.logging.level;


	public class TrainIO {
		
		private static Logger log= Logger.getLogger(TrainIO.class.getName());
		

		public TrainIO() {
			 log.info("Constructing TrainIO");
		        try {
		            Handler handler =new FileHandler("TrainIO.log");
		            Logger.getLogger("").addHandler(handler);
		        }catch(SecurityException | IOException e){
		            e.printStackTrace();
		        }
		}

		char [] out = new char[200];		//An array is declared with the size of 200

		//To save data into Train.txt file
		private void save() {


			try{

			FileWriter writer = new FileWriter("Train.txt");

			writer.write("\nSummary \nOwner\tType of Rail Car\tMinimum Weight\tCar Id\tCargo Weight\tMaximum Weight\nGermany\tRailway Plough\t\t50\t\tMP3108\t\t75\t1000");

			writer.flush();

			writer.close();

			}

			catch (IOException e) {

			e.printStackTrace();
			Logger.getLogger(TrainIO.class.getName()).log(Level.SEVERE, null, e);

		}

	}

		
		//to read Train.txt and display it
		public void load() throws IOException {


			try {

				FileReader reader = new FileReader("Train.txt");

				reader.read(out);

				for (char x:out) {

					System.out.print(x);

					}
				System.out.println();
				reader.close();

			}

			catch (FileNotFoundException e ) {
			throw new FileNotFoundException("Train.txt was not found.");
			//Logger.getLogger(TrainIO.class.getName()).log(Level.SEVERE, null, e);
	}

	}

		 

		public static void main(String[] args) throws IOException {

			TrainIO train= new TrainIO();

			train.save();

			train.load();



		}



	}

	