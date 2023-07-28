package com.xworkz.runner;

import com.xworkz.equals.Dryfruit;

public class DryRunner {
	public static void main(String[] args) {
		System.out.println("Running the main in Gold Runner");
		Dryfruit fruit1= new Dryfruit ("dates","Super Market","Online",355,1,50);
		Dryfruit  fruit2 = new Dryfruit ("dates","Super Market","Online",35,1,50); 
		
		System.out.println("Object 1= \n" + fruit1 + "\n");
		System.out.println("Object 2= \n" + fruit2 + "\n");
		
		boolean result=fruit1.equals(fruit2);
		System.out.println("Both Object beign is Same =" + result);
		
	}
}
