package com.xworkz.runner;

import com.xworkz.equals.Gold;
import com.xworkz.equals.Vechicle;

public class VechicleRunner {
public static void main(String[] args) {
	System.out.println("Running the main in Gold Runner");
	Vechicle bike1= new Vechicle("Scooty",85000.00d,"Vida ",50 ,"petrol");
	Vechicle bike2 = new Vechicle("Scooty",85000.00d,"Vida ",50 ,"Electric"); 
	
	System.out.println("Object 1= \n" + bike1 + "\n");
	System.out.println("Object 2= \n" + bike2 + "\n");
	
	boolean result=bike1.equals(bike2);
	System.out.println("Both Object beign is Same =" + result);
	
}
}
