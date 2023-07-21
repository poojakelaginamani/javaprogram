package com.xworkz.chaining;

public class ChickenRunner {
	public static void main(String[] args) {

		System.out.println("Running main..........................\n");

		Chicken chicken1 = new Chicken(200, "Banglore\n");
		chicken1.printInfo();

		Chicken chicken2 = new FarmChicken(300, "Manglore", 20, "John\n");
		chicken2.printInfo();

		Chicken chicken3 = new BroilerChicken(400, "Hubli", false, 4);
		chicken3.printInfo();


	}

}

