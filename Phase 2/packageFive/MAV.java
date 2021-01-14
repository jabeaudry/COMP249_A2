/**
 * 
 * @author Jacinthe Beaudry (40126080)
 * COMP249	
 * Assignment #2 
 * Phase 1 
 * Package 5	
 * Due Date: October 23rd 2020
 *
 */

package packageFive;
import packageFour.UAV;

public class MAV extends UAV{

	

	/** WHAT DOES THIS CLASS DO?
	 * 
	 * this class creates MAV objects.
	 * This class is derived from the base class UAV.
	 * 
	 * @author Jacinthe Beaudry (40126080)
	 * @version 1.0
	 * 
	 */
	//instance variables: private, can only be accessed by
	//the public accessor and mutator methods
		private String model;
		private double size;
	/**
		 * This main method creates Agricultural drones objects.
		 * 
		 * @param weight  double that indicates the weight of the agricultural drone
		 * @param price  double that indicates the price of the agricultural drone
		 * @param size double that indicates the size
		 * @param model String that indicates the model
		 * 
		 */
		
		//default constructor
		public MAV() {
			this.model = null;
			this.size = 0;
			
		}
		//parameterized constructor
		public MAV (double weight, double price, String model, double size) {
			super(weight, price);
			this.model = model;
			this.size = size;
		}
		
		//copy constructor
		public MAV (MAV aMAV) {
			weight = aMAV.weight;
			price = aMAV.price;
			this.model = aMAV.model;
			this.size = aMAV.size;
		}
		
		//model accessor & mutator
		
		public String getModel() {
			return model;
		}
		
		public void setModel (String model) {
			this.model = model;
		}
		
		//size accessor & mutator
		
		public double getSize() {
			return size;
		}
		
		public void setSize(double size) {
			this.size = size;
		}
		
		//toString method
		public String toString() {
			return("This MAV costs " + price + " dollars, weighs "+ weight + " pounds, is a model "+model+" and is "+size + " cm long.");
		}
		
		//equals method that returns a boolean
		public boolean equals(Object m) { 
			if (m == null || this.getClass() != m.getClass()) //returns false if the object is null or if the calling type is different
			return false;
		else
		{
			MAV aMAV = (MAV)m;		//passes the object to the copy constructor anAirplane		
			return (this.price== aMAV.price && this.weight == aMAV.weight && this.model == aMAV.model && this.size == aMAV.size); //compares copy with actual
		}
		}
			
		
}