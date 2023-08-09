package com.xworkz.abstraction.app;

public class WalterGuderian {
	 private Elevator elevator;
	   
	   public WalterGuderian(Elevator elevator) {
		   this.elevator=elevator;
	   }
	   
	   public void getCarryLuggage() {
		   if(elevator!=null) {
			   System.out.println("elevator is not null");
		   }
	   
	   else {
		   System.err.println("elevator is null");
	   }
	}
}
