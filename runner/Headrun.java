package com.xworkz.runner;

import com.xworkz.encapsulation.Headset;

public class Headrun {

	public static void main(String[] args) {
			System.out.println("Running main in Head Set Runner");
			
			Headset headset = new Headset();
			System.out.println(headset);
			headset.setHeadSet("One plus", "Oneplus Buds Bluetooth", 4999, "WireLess", "Black");
			System.out.println("* * * * * * * * * * * * * * * * * *");
			System.out.println(headset);
		}
	

}
