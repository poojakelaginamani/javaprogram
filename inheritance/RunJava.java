package com.xworkz.inheritance;

public class RunJava {
public static void main(String[] args) {
		
		Strength strength = new Strength ("Good",true);

	   System.out.println(strength.hardWork);
		System.out.println(strength.isStrength);
		
		System.out.println("-----------------------------");
		
		Strength strength1 = new Money("week",true);
		System.out.println(strength.isStrength);
	    System.out.println(strength1.hardWork);
			
}

}
