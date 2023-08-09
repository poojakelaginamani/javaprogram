package com.xworkz.abstraction.app;

public class DeepikaPadukone {
	 private Laptop laptop;
	   
	   public DeepikaPadukone(Laptop laptop) {
		   this.laptop=laptop;
	   }
	   
	   public void getdiplay() {
		   if(laptop!=null) {
			   System.out.println("Laptop is not null");
		   }
	   
	   else {
		   System.err.println("Laptop is null");
	   }
	}
}
