/* Name: Manali Milind Pandit
 * NUId: 001852743 
 */

package edu.neu.csye6200.train;

import java.util.Scanner;

public class EngineRailCar extends Car {
	
	double distance;
	double UsedFuel;
	double MilesPerGallon;
	double availfuel;
	double FuelCap = 4000;		//Maximum Fuel Tank Capacity 
	double MaxPullWgt;
	double efficiency;
	double range;
	
	Scanner sc = new Scanner(System.in);
	
	EngineRailCar(String name, String cartype, int minweight, String car_id, int cargo_wt, int maxweight, int vel, double MilesPerGallon)		//EngineRailCar constructor is defined
	{
		super(name, cartype, minweight, car_id, cargo_wt, maxweight, vel);		//super() will access all the values of the variables from the parent class method which is Car
		this.MilesPerGallon=MilesPerGallon;
	}
	
	public double AvailFuel() {		//Method to calculate the Available fuel in the Rail car Engine Tank
		System.out.println("\nEnter the Distance the Rail Car has Travelled : ");
		this.distance = sc.nextDouble();
		this.UsedFuel = distance/MilesPerGallon;		//Formula to calculate the used fuel
		this.availfuel = Math.round(FuelCap - this.UsedFuel);		//To get the available fuel subtract the used fuel from the max fuel capacity of the tank
		return this.availfuel;
	}
	 
	public double TowingPow() {		//To get the max pull weight
		this.MaxPullWgt = cargo_wt * 0.001 * 917.18;		
		return this.MaxPullWgt;
	}
	
	public double Efficiency() {		//Method to calculate the efficiency of the Rail Car Engine
		this.efficiency = Math.round((cargo_wt * distance)/UsedFuel);
		return efficiency;
	}
	
	public double range() {		//Method to calculate the range 
		this.range = FuelCap / MilesPerGallon;
		return range;
		
	}
	
	public String toString() {
		return (super.toString()+"\t\t\t" +availfuel+"\t\t" +TowingPow()+"\t\t" +Efficiency()+ "\t\t" +range());
		}
	
	public void run() {
		AvailFuel();
		toString();
		System.out.println("Summary\n" + "Owner of the Rail car \tType \t\tMinmum Weight \t\t Car Id \tCargo Weight \t Maximum Weight \t Velocity\t Available Fuel \t Towing Power \t Efficiency \t Range");
		System.out.println(toString());
	}
	
	public static void main(String args[]) {
		EngineRailCar erc1 = new EngineRailCar("Germany","Railway Plough",50,"MP3108", 75, 1000,80,50);
		EngineRailCar erc2 = new EngineRailCar("Renault","Autorail",60," HP2604",85,200,90,60);
		EngineRailCar erc3 = new EngineRailCar("US","Troop Sleeper",80,"SK2502", 95, 600,100,40);
		
		erc1.run();
		erc2.run();
		erc3.run();
		
		
	}
}
