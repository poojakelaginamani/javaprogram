package com.xworkz.abstraction.app;

public class Virat {
	private WaterPurifier water;
	   
	   public Virat(WaterPurifier water) {
		   this.water=water;
	   }
	   
	   public void getFilter() {
		   if(water!=null) {
			   System.out.println("water purifier is not null");
		   }
	   
	   else {
		   System.err.println("Water purifier is null");
	   }
	}
	
}
