/**
 * 
 * @author Jacinthe Beaudry (40126080)
 * COMP249	
 * Assignment #2 
 * Phase 1 
 * Package 4	
 * Due Date: October 23rd 2020
 *
 */

package packageFour;

/** WHAT DOES THIS CLASS DO?
 * 
 * this class creates UAV objects.
 * 
 * @author Jacinthe Beaudry (40126080)
 * @version 1.0
 * 
 */
public class UAV {    //protected, can only be accessed by the child classes and same package classes
protected double weight;
protected double price;

/** 
 * This main method creates UAV objects.
 * 
 * @param weight  double that indicates the weight of the UAV
 * @param price  double that indicates the price of the UAV
 * 
 */

//default constructor
public UAV() {
	this.weight = 0;
	this.price = 0;
}

//parameterized constructor
public UAV(double weight, double price) {
	this.weight = weight;
	this.price = price;
}

//copy constructor
public UAV (UAV aUAV) {
	price = aUAV.price;
	weight = aUAV.weight;
}

//price mutator and accessor

public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}

//weight mutator and accessor

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

//toString method 
public String toString() {
	return ("This UAV costs " + price + " dollars and weighs "+ weight + " pounds.");
}


//equals method compares two objcts of the same class
public boolean equals(Object u) { 
	if (u == null || this.getClass() != u.getClass()) //returns false if the object is null or if the calling type is different
	return false;
else
{
	UAV aUAV = (UAV)u;		//passes the object to the copy constructor anAirplane		
	return (this.price == aUAV.price && this.weight == aUAV.weight); //compares copy with actual
}
}
}