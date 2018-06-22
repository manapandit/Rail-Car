/* Name: Manali Milind Pandit
 * NUId: 001852743 
 */

package edu.neu.csye6200.train;

public class BoxCar extends Car {
	
	double size;
	int Length = 100;		//Length, Height and Width is initialized to a value 
	int Height = 50;
	int Width = 300;
	double weight;
	
	BoxCar(String name, String cartype, int minweight, String car_id, int cargo_wt, int maxweight, int vel)		//BoxCar constructor is defined
	{
		super(name, cartype, minweight, car_id, cargo_wt, maxweight, vel);		//super() will access all the values of the variables from the parent class method which is Car
		this.minweight= minweight;
	}
	
	public double Weight() {		//Method to calculate the weight of the Boxcar
		if (Type == "Boxcar	") {		// To check the type of the Rail Car and calculate the weight only if its a boxcar
			this.weight = cargo_wt + minweight;
		}
		return this.weight;
	}
	
	public double Size() {		//Method to calculate the size of the Boxcar
		if (Type == "Boxcar	") {
			this.size = Length * Height * Width;		
		}
		return this.size;
	}
	
	public String toString() {
		return (super.toString()+ "\t\t"+Weight()+"\t\t"+Size());
	}
	
	public void run() {
		if (Type == "Boxcar	") {
		System.out.println(toString());
		}
	}
	public static void main(String[] args) {
		BoxCar bx1 = new BoxCar("Germany","Boxcar	",50,"MP3108", 75, 1000,80);
		BoxCar bx2 = new BoxCar("Renault","Autorail",60,"HP2604",85,200,90);
		BoxCar bx3 = new BoxCar("US","Troop Sleeper",80,"SK2502", 95, 600,100);
		
		System.out.println("Summary\n\n" + "Owner of the Rail car \tType \t\tMinmum Weight \t\t Car Id \tCargo Weight \t Maximum Weight \t Velocity \t Weight \t Size");
		bx1.run();
		bx2.run();
		bx3.run();
	}

}
