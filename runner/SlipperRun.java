package com.xworkz.runner;

import com.xworkz.equals.Slipper;

public class SlipperRun {
	public static void main(String[] args) {
		System.out.println("Running the main in Gold Runner");
		 Slipper shoe1= new  Slipper ("Puma","Formal",8,1000,"Black","FootWear",true);
		 Slipper  shoe2 = new  Slipper("Puma","Formal",8,1000,"Black","FootWear",true); 
		
		System.out.println("Object 1= \n" + shoe1 + "\n");
		System.out.println("Object 2= \n" + shoe2 + "\n");
		
		boolean result=shoe1.equals(shoe2);
		System.out.println("Both Object beign is Same =" + result);
		
	}
}
