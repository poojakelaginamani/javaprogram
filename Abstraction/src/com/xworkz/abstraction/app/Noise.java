package com.xworkz.abstraction.app;

public class Noise {
   private SmartWatch watch;
   
   public Noise(SmartWatch watch) {
	   this.watch=watch;
   }
   
   public void getShowTime() {
	   if(watch!=null) {
		   System.out.println("Watch is not null");
	   }
   
   else {
	   System.err.println("watch is null");
   }
}
}