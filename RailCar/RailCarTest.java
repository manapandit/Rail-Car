

/* Name: Manali Milind Pandit
 * NUId: 001852743 
 */

package edu.neu.csye6200.train;
import edu.neu.csye6200.train.Car;
public class RailCarTest {

	public static void main(String[] args) {		//Three RailCar instances are used in the Car constructor
		Car rc1 = new Car("Germany","Railway Plough",50,"MP3108", 75, 1000,80);
		Car rc2 = new Car("Renault","Autorail",60," HP2604",85,200,90);
		Car rc3 = new Car("United States","Troop Sleeper",80,"SK2502", 95, 600,100);
		
		
		
		//Calling the Display Method
		rc1.display();
		rc2.display();
		rc3.display();
			

		
		System.out.println("Program is done");
		

	}

}
