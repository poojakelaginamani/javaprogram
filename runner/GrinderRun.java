package com.xworkz.runner;
import com.xworkz.encapsulation.Grinder;

public class GrinderRun {
	public static void main(String[] args) {
		System.out.println("Running main in Grinder Runner");

		
		Grinder grinder = new Grinder();
		
		System.out.println(grinder);
		
		grinder.setBrandName("LG");
		grinder.setPrice(4500);
		grinder.setWarrenty(true);
		grinder.setSpeed(45.0f);
		
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
		
		System.out.println(grinder);
		
	}

}
