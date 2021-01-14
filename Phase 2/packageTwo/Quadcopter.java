/**
 * 
 * @author Jacinthe Beaudry (40126080)
 * COMP249	
 * Assignment #2 
 * Phase 1
 * Package 2	
 * Due Date: October 23rd 2020
 *
 */

package packageTwo;

import packageTwo.Helicopter;

/** WHAT DOES THIS CLASS DO?
 * 
 * This class is a child of the base class Helicopter, which is a child of Airplane. 
 * It creates quadcopter objects.
 * 
 * @author Jacinthe Beaudry (40126080)
 * @version 1.0
 * 
 */


public class Quadcopter extends Helicopter{

	//instance variable: private, can only be accessed by
	//the public accessor and mutator methods
		private int speed;   
		
		/** 
		 * This main method creates quadcopter objects.
		 * 
		 * @param brand the brand of the quadcopter as a String, derived from Airplane
		 * @param price a double that represents the price of the quadcopter, derived from Airplane
		 * @param housePwr an integer that represents the horse power of the quadcopter, derived from Airplane
		 * @param cylinder integer, amount of cylinders of the quadcopter  derived from Helicopter
		 * @param year integer representing the year of creation, derived from Helicopter
		 * @param capacity integer representing the maximum capacity of passengers, derived from Helicopter
		 * @param speed this integer represents the maximum flying speed
		 * 	
		 */
		//default constructor
		public Quadcopter() {
			this.speed = 0;
			
		}
		 
		//parameterized constructor
		public Quadcopter(String brand, double price, int horsePwr, int cylinder, int year,  int capacity, int speed) {
			super (brand,price,horsePwr,year,cylinder, capacity);
			this.speed= speed;
		}
		
		//copy constructor
		public Quadcopter(Quadcopter aQuadcopter) {
			brand = aQuadcopter.brand;
			price = aQuadcopter.price;
			horsePwr = aQuadcopter.horsePwr;
			year = aQuadcopter.year;
			cylinder = aQuadcopter.cylinder;
			capacity = aQuadcopter.capacity;
			speed = aQuadcopter.speed;
		}
		
		//accessor and mutator: speed
		public int getSpeed() {
			return speed;
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		//this method creates a String that prints out the attributes of the selected quadcopter
		public String toString() {
			return ("This " + getBrand() + " quadcopter sells for "+ getPrice() +
					", has "+ getHorsePwr() + " horsepower, has " + getCylinder() +
					" cylinders, was built in " + getYear() + " can carry " +
					getCapacity() + " person/people and has a maximum flying speed of "+speed+"km/h.");
		}
		
		
		//this method compares two quadcopter objects 
		public boolean equals(Object q) { 
			if (q == null || this.getClass() != q.getClass()) //returns false if the object is null or if the object is a different type
			return false;
		else
		{
			Quadcopter aQuadcopter = (Quadcopter)q;		//passes the object to the copy constructor aHelicopter	
			return (this.brand == aQuadcopter.brand && this.price == aQuadcopter.price && this.horsePwr == aQuadcopter.horsePwr && this.capacity == aQuadcopter.capacity && this.cylinder == aQuadcopter.cylinder && this.year == aQuadcopter.year && this.speed == aQuadcopter.speed); //compares copy with actual
		}
		}
		
}
