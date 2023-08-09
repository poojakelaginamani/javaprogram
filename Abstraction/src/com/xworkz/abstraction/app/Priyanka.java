package com.xworkz.abstraction.app;

public class Priyanka {
	 private WashingMachine wash;
	   
	   public Priyanka(WashingMachine wash) {
		   this.wash=wash;
	   }
	   
	   public void getClean() {
		   if(wash!=null) {
			   System.out.println("washing machine is not null");
		   }
	   
	   else {
		   System.err.println("Washing machine is null");
	   }
	}
	
}
