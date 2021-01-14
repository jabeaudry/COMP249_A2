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

//import classes
import packageOne.Airplane;
import packageTwo.Helicopter;
import packageTwo.Quadcopter;
import packageThree.Multirotor;
import packageFour.UAV;
import packageFive.MAV;
import flyingObjectsPackage.FlyingObjects;
import packageFive.AgriculturalDrone;


/**
 * 
 * This is the driver class. It compiles flying objects into an array. The flying objects are created using seven different classes
 * and come from 5 different packages.
 * 
 * @author Jacinthe Beaudry 40126080
 * @version 1.0
 *
 */
public class DriverTwo {
	//since none of the objects are a part of the FlyingObjects class,
	//they will not print out correctly, since FlyingObjects does not have a toString
	//method. Using a copy constructor is not enough to satisfy the conditions of polymorphism.
	public static FlyingObjects[] copyFlyingObjects(FlyingObjects [] fly) {
		
		//creates the array that will hold the copies
		FlyingObjects[] arrayToCopy = new FlyingObjects[fly.length];
		for (int k = 0; k < fly.length; k++) {
			arrayToCopy[k] = new FlyingObjects(fly[k]);
		}
		return arrayToCopy;   
		
	}
	public static void main(String[] args) {
		
		
		//welcome message
		System.out.println("--------------------------\n"+
				"  Welcome to Jacinthe's flying stuff inventory!\n"+
				"--------------------------\n");
		
		//objects
		Airplane air1 = new Airplane ("Fisher", 200.00, 3);
		Airplane air2 = new Airplane ("Tonka", 300.45, 4);
		Airplane air3 = air1;
		Helicopter hel1 = new Helicopter("Fisher", 34.44, 3, 5, 1999, 2);
		Helicopter hel2 = new Helicopter("R2D2", 7575.99, 4, 2, 2001, 3);
		Helicopter hel3 = hel1;
		Quadcopter quad1 = new Quadcopter("Four",400.30, 5, 6, 2007, 5,1);
		Quadcopter quad2 = new Quadcopter("Speed",233.33, 2, 2, 2005, 2,3);
		Quadcopter quad3 = new Quadcopter("Speed",275.33, 2, 3, 2005, 2,300);
		Multirotor mul1 = new Multirotor ("RotoBeast",285.45, 4, 3, 2011, 4,3);
		UAV uav1 = new UAV (23, 3.00);
		UAV uav2 = uav1;
		AgriculturalDrone ad1 = new AgriculturalDrone (90, 4, 3, "WheatMonster");
		AgriculturalDrone ad2 = new AgriculturalDrone (90, 4, 3, "Milk");
		MAV mav1 = new MAV (67, 32, "third", 1);
		MAV mav2 = new MAV (64, 32, "five", 1);
		
		//message telling the user we are going to print out all the objects
		System.out.println("Here are the objects we have: ");
		
		//printing the objects
		System.out.println(air1);
		System.out.println(air2);
		System.out.println(air3);
		System.out.println(hel1);
		System.out.println(hel2);
		System.out.println(hel3);
		System.out.println(quad1);
		System.out.println(quad2);
		System.out.println(quad3);
		System.out.println(mul1);
		System.out.println(uav1);
		System.out.println(uav2);
		System.out.println(ad1);
		System.out.println(ad2);
		System.out.println(mav1);
		System.out.println(mav2);
		
		
		
		//we will now compare the objects
		System.out.println("Let's compare these flying objects! ");
		System.out.println("We only have one multirotor.");
		
		if (air1.equals(air2)) {
			System.out.println("Airplane 1 and 2 are equal.");
		}
		else {
			System.out.println("Airplane 1 and 2 aren't equal.");
		}
		
		if (air3.equals(air2)) {
			System.out.println("Airplane 2 and 3 are equal.");
		}
		else {
			System.out.println("Airplane 2 and 3 aren't equal.");
		}
		if (air3.equals(air1)) {
			System.out.println("Airplane 1 and 3 are equal.");
		}
		else {
			System.out.println("Airplane 1 and 3 aren't equal.");
		}
		if (hel1.equals(hel2)) {
			System.out.println("Helicopter 1 and 2 are equal.");
		}
		else {
			System.out.println("Helicopter 1 and 2 aren't equal.");
		}
		
		if (hel3.equals(hel2)) {
			System.out.println("Helicopter 2 and 3 are equal.");
		}
		else {
			System.out.println("Helicopter 2 and 3 aren't equal.");
		}
		if (hel3.equals(hel1)) {
			System.out.println("Helicopter 1 and 3 are equal.");
		}
		else {
			System.out.println("Helicopter 1 and 3 aren't equal.");
		}
		if (quad1.equals(quad2)) {
			System.out.println("Quadcopter 1 and 2 are equal.");
		}
		else {
			System.out.println("Quadcopter 1 and 2 aren't equal.");
		}
		if (quad3.equals(quad2)) {
			System.out.println("Quadcopter 2 and 3 are equal.");
		}
		else {
			System.out.println("Quadcopter 2 and 3 aren't equal.");
		}
		if (quad1.equals(quad3)) {
			System.out.println("Quadcopter 1 and 3 are equal.");
		}
		else {
			System.out.println("Quadcopter 1 and 3 aren't equal.");
		}
		if (uav1.equals(uav2)) {
			System.out.println("UAV 1 and 2 are equal.");
		}
		else {
			System.out.println("UAV 1 and 2 aren't equal.");
		}
		if (ad1.equals(ad2)) {
			System.out.println("Agricultural drone 1 and 2 are equal.");
		}
		else {
			System.out.println("Agricultural drone 1 and 2 aren't equal.");
		}
		if (mav1.equals(mav2)) {
			System.out.println("MAV 1 and 2 are equal.");
		}
		else {
			System.out.println("MAV 1 and 2 aren't equal.");
		}
		
		//creating an array
		FlyingObjects[] flyingStuff = new FlyingObjects[16];
		flyingStuff[0] = air1;
		flyingStuff[1] = air2;
		flyingStuff[2] = air3;
		flyingStuff[3] = hel1;
		flyingStuff[4] = hel2;
		flyingStuff[5] = hel3;
		flyingStuff[6] = quad1;
		flyingStuff[7] = quad2;
		flyingStuff[8] = quad3;
		flyingStuff[9] = mul1;
		flyingStuff[10] = uav1;
		flyingStuff[11] =  uav2;
		flyingStuff[12] = ad1;
		flyingStuff[13] = ad2;
		flyingStuff[14] = mav1;
		flyingStuff[15] =  mav2;
		
		System.out.println("\nHere are the objects in the original array:\n");
		for (int a = 0; a < (flyingStuff.length); a++) {
			System.out.println(flyingStuff[a]);
		}
		//copy array
		FlyingObjects[] arrayCopy = copyFlyingObjects(flyingStuff);    //this array will hold the copy
		System.out.println("\nHere are the objects present in the copy of the array: \n");
			
		
			
		for (int l = 0; l < (flyingStuff.length); l++) {
			System.out.println(arrayCopy[l]);
		}
			
		System.out.println("\n\nThe following flying object/s is/are the cheapest: \n");
		
		//find the two least expensive objects
		
		//these boolean arrays will keep track of which index values have low prices
		boolean [] flagLowest = new boolean [16]; 	
		boolean [] flagSecondLowest = new boolean [16];
		//these doubles will store the lowest price values
		double round1Price = 0;
		double finalround1Price = 0;
		//these doubles will store the second lowest pirce values
		double round2Price = 0;
		double finalround2Price = 0;
		//these doubles store the value of the first array object. If it is not the lowest, it will be replaced.
		double firstPrice = 0;
		double firstPrice2 = 0;
		//checks for the lowest price
		for (int j=0; j < flyingStuff.length; j++) {
			
			
			//checks which class the array object is from
			if (flyingStuff[j].getClass() == air1.getClass()) {
				round1Price = ((Airplane) flyingStuff[j]).getPrice();
			}
			if (flyingStuff[j].getClass() ==hel1.getClass()) {
				round1Price = ((Helicopter) flyingStuff[j]).getPrice();
			}
			if (flyingStuff[j].getClass() == quad1.getClass()) {
				round1Price = ((Quadcopter) flyingStuff[j]).getPrice();
			}
			if (flyingStuff[j].getClass() == uav1.getClass()) {
				round1Price = ((UAV) flyingStuff[j]).getPrice();
			}
			if (flyingStuff[j].getClass() == mul1.getClass()) {
				round1Price = ((Multirotor) flyingStuff[j]).getPrice();
			}
			if ((flyingStuff[j]).getClass() == mav1.getClass()) {
				round1Price = ((MAV) flyingStuff[j]).getPrice();
			}
			if ((flyingStuff[j]).getClass() == ad1.getClass()) {
				round1Price = ((AgriculturalDrone) flyingStuff[j]).getPrice();
			}
			//the first object is assigned to the lowest price by default
			if (j == 0) {
				finalround1Price = round1Price;
				firstPrice = round1Price;
				flagLowest[j] = true;
			}
			//if the next value is equal to the previous lowest
			else if (j != 0 && round1Price == finalround1Price) {
				finalround1Price = round1Price;
				flagLowest[j] = true;
			}
			//if the next value is lower than the previous value
			else if (j != 0 && round1Price < finalround1Price) {
				for (int x = 0; x < flagLowest.length; x++) {//resets the boolean index of the cheapest prices
					flagLowest[x] = false;
				}
				finalround1Price = round1Price;
				flagLowest[j] = true;
			}
			//when the array has been searched, the first value is set to false if it was not the lowest
			if (j == ((flyingStuff.length) - 1)) {
				if (firstPrice > finalround1Price) {
					flagLowest[0] = false;   //if the first item is not the cheapest, sets it back to false
				}
			}
		}
		//this searches all the flagged values that are true and prints them out
		for (int k = 0; k < flyingStuff.length; k++) {
			if (flagLowest[k] == true) {
				System.out.println(flyingStuff[k]+" It has the index: "+ k);;
			}
		}
		
		//checks for the 2nd lowest price
		for(int i=0; i < flyingStuff.length; i++){
			
			
			if (flyingStuff[i].getClass() == air1.getClass()) {
				round2Price = ((Airplane) flyingStuff[i]).getPrice();
			}
			if (flyingStuff[i].getClass() ==hel1.getClass()) {
				round2Price = ((Helicopter) flyingStuff[i]).getPrice();
			}
			if (flyingStuff[i].getClass() == quad1.getClass()) {
				round2Price = ((Quadcopter) flyingStuff[i]).getPrice();
			}
			if (flyingStuff[i].getClass() == uav1.getClass()) {
				round2Price = ((UAV) flyingStuff[i]).getPrice();
			}
			if (flyingStuff[i].getClass() == mul1.getClass()) {
				round2Price = ((Multirotor) flyingStuff[i]).getPrice();
			}
			if ((flyingStuff[i]).getClass() == mav1.getClass()) {
				round2Price = ((MAV) flyingStuff[i]).getPrice();
			}
			if ((flyingStuff[i]).getClass() == ad1.getClass()) {
				round2Price = ((AgriculturalDrone) flyingStuff[i]).getPrice();
			}
			//the first object is assigned to the lowest price by default
			if (i == 0 && round2Price > finalround1Price) {    //first item is set by default to the cheapest
				finalround2Price = round2Price;
				firstPrice2 = round2Price;
				flagSecondLowest[i] = true;
			}
			//if the next value is equal to the previous 2nd lowest and is bigger than the biggest lowest
			else if (i != 0 && (round2Price == finalround2Price) && (round2Price > finalround1Price)) {    //compares other objects
				finalround2Price = round2Price;
				flagSecondLowest[i] = true;
			}
			//if the next value is smaller than the previous 2nd lowest and is bigger than the biggest lowest
			else if (i != 0 && (round2Price < finalround2Price) && (round2Price > finalround1Price)) {
				for (int y = 0; y < flagSecondLowest.length; y++) {  //resets the boolean index of the 2nd cheapest prices
					flagSecondLowest[y] = false;
				}
				finalround2Price = round2Price;
				flagSecondLowest[i] = true;
			}
			else {
				continue;
			}
			if (i == (flyingStuff.length-1)) {
				if (firstPrice2 > finalround2Price) {
					flagSecondLowest[0] = false;   //if the first item is not the 2nd cheapest, sets it back to false
				}
			}
		}
		//this searches all the flagged values that are true and prints them out
		System.out.println("\nThe following flying object/s is/are the second cheapest: \n");
		for (int p = 0; p < flyingStuff.length; p++) {
			if (flagSecondLowest[p] == true) {
				System.out.println(flyingStuff[p]+" It has the index: "+ p);;
			}
		}
		System.out.println("Thank you for using our system! You will now exit!");   //exit
		
	}
}

