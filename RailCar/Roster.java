/* Name: Manali Milind Pandit
 * NUId: 001852743 
 */

package edu.neu.csye6200.train;


	
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.logging.FileHandler;
	import java.util.logging.Handler;
	import java.util.logging.Logger;

public class Roster {
	
	
	    
	    private static Logger log= Logger.getLogger(Roster.class.getName());
	   
	    private static Roster instance=null;
	    
	    private Roster(){
	        log.info("INFO: Constructing a  method");
	        try {
	            Handler handler =new FileHandler("Roster.log");
	            Logger.getLogger("").addHandler(handler);
	        }catch(SecurityException | IOException e){
	            e.printStackTrace();
	        }
	        
	    }
	    
	    public static Roster instance(){
	        if(instance==null) instance=new Roster();
	        return(instance);
	    }
	    
	    
	   
	 public static void main(String[] args) {
	       Roster x = new Roster();
	      Car rw = new Car("Germany","Railway Plough",50,"MP3108", 75, 1000,80);
	      
	      ArrayList <Car> rlist =new ArrayList<Car>();	//created an array list and added the objects in it
	      rlist.add(rw);
	      rlist.add(new Car("Renault","Autorail",60,"HP2604",85,200,90));
	      rlist.add(new Car("US","Troop Sleeper",80,"SK2502", 95, 600,100));
	      rlist.add(new Car("West Express", "Wagon", 90, "SP2202", 80, 400, 90));
	      rlist.add(new Car("Nothern", "Boxcar", 40, "BP1509", 50, 500, 70));
	 
	      //Sorting based on car_id in ascending order
	     Collections.sort(rlist, Collections.reverseOrder());
	      
	      for (Car car : rlist){
	            System.out.println(" " + car);
	        }
	 }
	   
	  
	}


