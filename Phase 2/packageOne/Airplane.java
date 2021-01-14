/**
 * 
 * @author Jacinthe Beaudry (40126080)
 * COMP249	
 * Assignment #2 
 * Phase 2
 * Package 1	
 * Due Date: October 23rd 2020
 *
 */

package packageOne;
import flyingObjectsPackage.FlyingObjects; //importing parent class


/** This class creates airplanes, prints them out as
 *  a String and compares different airplanes together.
 * 
 * @author Jacinthe Beaudry (40126080)
 * @version 1.0
 * 
 */	

//base class: Airplane
public class Airplane extends FlyingObjects {


//instance variables: protected, can only be accessed by
//its child classes and classes in the same package
	//can't be accessed with ease by UAV and its children
protected String brand;
protected double price;
protected int horsePwr;

/** 
 * This main method creates Airplane objects.
 * 
 * @param brand the brand of the airplane as a String
 * @param price a double that represents the price of the airplane
 * @param housePwr an integer that represents the horse power of the airplane
 * 	
 */

//default constructor
public Airplane() {
	this.brand = null;
	this.price=0;
	this.horsePwr=0;
}

//parameterized constructor
public Airplane(String brand, double price, int horsePwr) {
	this.brand = brand;
	this.price = price;
	this.horsePwr = horsePwr;
}

//copy constructor
public Airplane(Airplane anAirplane) 
{
	brand = anAirplane.brand;
	price = anAirplane.price;
	horsePwr = anAirplane.horsePwr;
}

//brand accessor and mutator methods
public String getBrand() {
	return brand;
}

public void setBrand (String brand) {
	this.brand = brand;
}

//price accessor and mutator methods
public double getPrice() {
	return price;
}

public void setPrice (double price) {
	this.price = price;
}

//horsepower accesor and mutator methods
public int getHorsePwr() {
	return horsePwr;
}

public void setHorsePwr(int horsePwr) {
	this.horsePwr = horsePwr;
}

//toString method (returns String)
public String toString() {
	return ("This " + brand + " airplane sells for "+ price + " dollars and has "+ horsePwr + " horsepower.");
}

//equals() method (returns boolean)
public boolean equals(Object a) { 
	if (a == null || this.getClass() != a.getClass()) //returns false if the object is null or if the calling type is different
	return false;
else
{
	Airplane anAirplane = (Airplane)a;		//passes the object to the copy constructor anAirplane		
	return (this.brand == anAirplane.brand && this.price == anAirplane.price && this.horsePwr == anAirplane.horsePwr); //compares copy with actual
}
}



	
}

