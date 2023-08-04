package com.xworkz.app.army;

public class MetroRule implements metro {

	@Override
	public void getCoins() {
		System.out.println("invoking the metro rules");
	}
	
	@Override
	public void getWithinTime() {
		System.out.println("the coins is vaild only one hour");
	}

}
