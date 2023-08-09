package com.xworkz.abstraction.app;

public class WasteProducts {
	private Kidney function;
	   
	   public WasteProducts (Kidney function) {
		   this.function=function;
	   }
	   
	   public void getCleans() {
		   if(function!=null) {
			   System.out.println("Kidney is not null");
		   }
	   
	   else {
		   System.err.println("kidney is null");
	   }
	}
	
}
