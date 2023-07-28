package com.xworkz.runner;

import com.xworkz.equals.Gold;

public class GoldRunner {
 public static void main(String[] args) {
	System.out.println("Running the main in Gold Runner");
	Gold jewellery1= new Gold("GRT",65000l,"Medium","Round");
	Gold jewellery2 = new Gold("GRT",65000l,"Medium","Round"); 
	
	System.out.println("Object 1= \n" + jewellery1 + "\n");
	System.out.println("Object 2= \n" + jewellery2 + "\n");
	
	boolean result=jewellery1.equals(jewellery2);
	System.out.println("Both Object beign is Same =" + result);
	
} 
 
}
