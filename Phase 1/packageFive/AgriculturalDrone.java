/**
 * 
 * @author Jacinthe Beaudry (40126080)
 * COMP249	
 * Assignment #2 
 * Phase 2 
 * Package 5	
 * Due Date: October 23rd 2020
 *
 */

package packageFive;
import packageFour.UAV;

/** WHAT DOES THIS CLASS DO?
 * 
 * this class creates Agricultural drones objects.
 * This class is derived from the base class UAV.
 * 
 * @author Jacinthe Beaudry (40126080)
 * @version 1.0
 * 
 */
public class AgriculturalDrone extends UAV {
	
	//instance variables: private, can only be accessed by
	//the public accessor and mutator methods
	private int capacity;
	private String brand;
	/** 
	 * This main method creates Agricultural drones objects.
	 * 
	 * @param weight  double that indicates the weight of the agricultural drone, derived from UAV
	 * @param price  double that indicates the price of the agricultural drone, derived from UAV
	 * @param capacity integer that indicates the carry capacity
	 * @param brand String that indicates the brand
	 * 
	 */
	
	//default constructor
	public AgriculturalDrone() {
		this.capacity = 0;
		this.brand = null;
		
	}
	//parameterized constructor
	public AgriculturalDrone (double weight, double price, int capacity, String brand) {
		super(weight, price);
		this.capacity = capacity;
		this.brand = brand;
	}
	
	//copy constructor
	public AgriculturalDrone (AgriculturalDrone anAD) {
		weight = anAD.weight;
		price = anAD.price;
		this.capacity = anAD.capacity;
		this.brand = anAD.brand;
	}
	
	//capacity accessor & mutator
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity (int capacity) {
		this.capacity = capacity;
	}
	
	//brand accessor & mutator
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//toString method
	public String toString() {
		return("This Agricultural drone costs " + price + " dollars, weighs "+ weight + " pounds, has a capacity of "+capacity+" person/people and was manufactured by "+brand + ".");
	}
	
	//equals method that returns a boolean
	public boolean equals(Object ad) { 
		if (ad == null || this.getClass() != ad.getClass()) //returns false if the object is null or if the calling type is different
		return false;
	else
	{
		AgriculturalDrone anAD = (AgriculturalDrone)ad;		//passes the object to the copy constructor anAirplane		
		return (this.price== anAD.price && this.weight == anAD.weight && this.capacity == anAD.capacity && this.brand == anAD.brand); //compares copy with actual
	}
	}
		
	
}
