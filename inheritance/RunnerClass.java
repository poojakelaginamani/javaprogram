package com.xworkz.inheritance;

public class RunnerClass {
  
public static void main(String[] args) {
		
		IceCream ice = new IceCream ("chocolate",207,true);

		System.out.println(ice.name);
		System.out.println(ice.calories);
		System.out.println(ice.isTasty);
		
		System.out.println("-----------------------------");
		
		Food ice1 = new IceCream("vanilla",208,false);
		System.out.println(ice1.isTasty);
		System.out.println(ice1.name);
		System.out.println(ice1.calories);
			
}
}

  

