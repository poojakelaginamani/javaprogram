package com.xworkz.runner;

import com.xworkz.equals.Grocery;

public class GroceryRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Grocery Runner\n");
		//Grocery grocery3 = new Grocery("Apple","chilly")
		Grocery grocery1 = new Grocery("Mango","onion");
		Grocery grocery2 = new Grocery("Mango","chilly");
		
		System.out.println("Object one: \n" + grocery1 + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("Object two: \n" + grocery2 + "\n");

		boolean result = grocery1.equals(grocery2);
		System.out.println("The grocery being same is : " + result);
	}


}
