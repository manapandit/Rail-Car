/* Name: Manali Milind Pandit
 * NUId: 001852743 
 */
package edu.neu.csye6200.train;

import java.io.Serializable;

public class Car implements Serializable,Comparable<Car> {		//Defined a Class named Car
	String Owner;
	String Type;
	double minweight;
	double maxweight;
	double force; 
	double distance;
	double time;
	int vel;
	String car_id;
	int cargo_wt;
	
	

	
	Car(String name,String cartype, int minweight, String car_id, int cargo_wt, int maxweight, int vel) {		//Constructor is defined

	Owner=name;
	Type= cartype;	
	this.minweight = minweight;
	this.car_id = car_id;
	this.cargo_wt = cargo_wt;
	this.maxweight = maxweight;
	this.vel = vel;
	this.force = force();
	this.time = time();
	this.distance = distance();
	
	
	}
	public double force() {		//Force Method is defined

		double f = ( ( this.minweight + this.maxweight) / 2)  *  9.81; 		//The force is given in KiloNewton
		return f;
	}
	public double distance() {		//Distance Method is defined 
	
		double avgWt = ( minweight + maxweight ) / 2;
		double distance = avgWt * (vel*vel) / (2*force) ;
		return  distance;
	}
	public double time() {		//Time Method is defined
		double t;
		double totalWeight = vel * (this.minweight + this.maxweight) / 2;
		t = totalWeight / this.force;		//Time is given in secs
		return t;
	}
	
	 public int compareTo(Car mp){
	        
	       
	        return mp.car_id.compareTo(car_id);    
	    }
	
public String toString(){
		
		return this.Owner+"\t\t\t"+this.Type+"\t\t"+this.minweight+"\t\t"+this.car_id+"\t\t"+this.cargo_wt+ "\t " + "\t\t"+this.maxweight+"\t\t"+this.vel;
	}

	public void display() {			//Display Method is defined
		System.out.println("OWNER: " + Owner + "\t" + "TYPE OF RailCar: " + Type);
		System.out.println("Minweight: " + minweight + " Maxweight: " + maxweight);
		System.out.println("Car ID: " + car_id);
		System.out.println("Cargo weight: " + cargo_wt);
		System.out.println("Force : "+this.force);
		System.out.println("Time in secs: "+ this.time);
		System.out.println("Distance is : " + this.distance);
		System.out.println("\n");
		
	}
	


}

