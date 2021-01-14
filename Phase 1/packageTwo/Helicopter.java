/**
 * 
 * @author Jacinthe Beaudry (40126080)
 * COMP249	
 * Assignment #2 
 * Phase 2 
 * Package 2	
 * Due Date: October 23rd 2020
 *
 */



package packageTwo;

import packageOne.Airplane;

//
	/** WHAT DOES THIS CLASS DO?
	 * 
	 * This class is a child of the base class Airplane. 
	 * It creates helicopter objects.This is the child class Helicopter, derived from the class Airplane
	 * 
	 * @author Jacinthe Beaudry (40126080)
	 * @version 1.0
	 * 
	 */
public class Helicopter extends Airplane {
	

	
	//instance variables are protected so the children classes
	//Quadcopter(same package, child) and Multirotor(child) can access with ease
	
	protected int cylinder;
	protected int year;
	protected int capacity;
	
	/** 
	 * This main method creates helicopter objects.
	 * 
	 * @param brand the brand of the helicopter as a String, derived from Airplane
	 * @param price a double that represents the price of the helicopter, derived from Airplane
	 * @param housePwr an integer that represents the horse power of the helicopter, derived from Airplane
	 * @param cylinder integer, amount of cylinders of the helicopter
	 * @param year integer representing the year of creation
	 * @param capacity integer representing the maximum capacity of passengers 
	 * 	
	 */
	
	//default constructor
	public Helicopter() {
		this.cylinder = 0;
		this.year = 0;
		this.capacity = 0;
		
	}
	
	//parameterized constructor
	public Helicopter(String brand, double price, int horsePwr, int cylinder, int year, int capacity) {
		super (brand, price, horsePwr);
		this.year = year;
		this.cylinder = cylinder;
		this.capacity = capacity;
	}
	
	//copy constructor
	public Helicopter(Helicopter aHelicopter) {
		brand = aHelicopter.brand;
		price = aHelicopter.price;
		horsePwr = aHelicopter.horsePwr;
		year = aHelicopter.year;
		cylinder = aHelicopter.cylinder;
		capacity = aHelicopter.capacity;
	}
	
	//year accessor and mutator methods
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	//cylinder accessor and mutator methods
	public int getCylinder() {
		return cylinder;
	}
	
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	
	//passenger capacity accessor and mutator methods
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	//this method creates a String that prints out the attributes of the selected helicopter
	public String toString() {
		return ("This " + brand + " helicopter sells for "+ price +
				", has "+ horsePwr + " horsepower, has " + cylinder +
				" cylinders, was built in " + year + " and can carry " +
				capacity + " person/people.");
	}
	
	public boolean equals(Object h) { 
		if (h == null || this.getClass() != h.getClass()) //returns false if the object is null or if the object is a different type
		return false;
	else
	{
		Helicopter aHelicopter = (Helicopter)h;		//passes the object to the copy constructor aHelicopter	
		return (this.brand == aHelicopter.brand && this.price == aHelicopter.price && this.horsePwr == aHelicopter.horsePwr && this.capacity == aHelicopter.capacity && this.cylinder == aHelicopter.cylinder && this.year == aHelicopter.year); //compares copy with actual
	}
	}
}
