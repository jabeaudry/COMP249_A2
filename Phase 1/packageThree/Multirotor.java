/**
 * 
 * @author Jacinthe Beaudry (40126080)
 * COMP249	
 * Assignment #2 
 * Phase 2
 * Package 3	
 * Due Date: October 23rd 2020
 *
 */

package packageThree;
import packageTwo.Helicopter;

/** WHAT DOES THIS CLASS DO?
 * 
 * This class is a child of the base class Helicopter, which is a child of Airplane. 
 * It creates rotormotor objects.
 * 
 * @author Jacinthe Beaudry (40126080)
 * @version 1.0
 * 
 */

public class Multirotor extends Helicopter {
	//instance variable: private, can only be accessed by
	//the public accessor and mutator methods
	private int rotorAmnt; 
	
	
	/** 
	 * This main method creates multirotor objects.
	 * 
	 * @param brand the brand of the multirotor as a String, derived from Airplane
	 * @param price a double that represents the price of the multirotor, derived from Airplane
	 * @param housePwr an integer that represents the horse power of the multirotor, derived from Airplane
	 * @param cylinder integer, amount of cylinders of the multirotor, derived from Helicopter
	 * @param year integer representing the year of creation, derived from Helicopter
	 * @param capacity integer representing the maximum capacity of passengers 
	 * 	
	 */
	
	//default constructor
	public Multirotor() {
		this.rotorAmnt = 0;
		
	}
	
	//parameterized constructor
	public Multirotor(String brand, double price, int horsePwr, int cylinder, int year, int capacity, int rotorAmnt) {
		super (brand, price, horsePwr, year, cylinder, capacity);
		this.rotorAmnt = rotorAmnt;
	}
	//copy constructor
	public Multirotor(Multirotor aMultirotor) {
		brand = aMultirotor.brand;
		price = aMultirotor.price;
		horsePwr = aMultirotor.horsePwr;
		year = aMultirotor.year;
		cylinder = aMultirotor.cylinder;
		capacity = aMultirotor.capacity;
		rotorAmnt = aMultirotor.rotorAmnt;
		
	}
	
	//rotorAmnt accessor and mutator methods
	public int getRotor() {
		return rotorAmnt;
	}
	
	public void setRotor(int rotorAmnt) {
		this.rotorAmnt = rotorAmnt;
	}
	
	
	//this method creates a String that prints out the attributes of the selected helicopter
	public String toString() {
		return ("This " + getBrand() + " multirotor sells for "+ getPrice() +
				", has "+ getHorsePwr() + " horsepower, has " + getCylinder() +
				" cylinders, was built in " + getYear() + ",can carry " +
				getCapacity() + " person/people and has "+rotorAmnt+" rotors.");
	}
	
	public boolean equals(Object m) { 
		if (m == null || this.getClass() != m.getClass()) //returns false if the object is null or if the object is a different type
		return false;
	else
	{
		Multirotor aMultirotor = (Multirotor)m;		//passes the object to the copy constructor aHelicopter	
		return (this.brand == aMultirotor.brand && this.price == aMultirotor.price && this.horsePwr == aMultirotor.horsePwr && this.capacity == aMultirotor.capacity && this.cylinder == aMultirotor.cylinder && this.year == aMultirotor.year && this.rotorAmnt == aMultirotor.rotorAmnt); //compares copy with actual
	}
}
}




