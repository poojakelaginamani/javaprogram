package com.xworkz.runner;

import com.xworkz.encapsulation.Satelliete;

public class SatellieteRun {
	
		public static void main(String[] args) {
			System.out.println("Running main in Satellite Runner");
			
			Satelliete satelliete = new Satelliete();
			
			System.out.println(satelliete);
			satelliete.setName("Chandrayan 3");
			satelliete.setPrice(61.500000d);
			satelliete.setLaunch("July");
			satelliete.setApplication("Navigation");
			satelliete.setSpeed(67889787l);
			
			System.out.println("* * * * * * * * * * * * * * * * *");
			System.out.println(satelliete);
		}

}
