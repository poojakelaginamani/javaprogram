package com.xworkz.inheritance;

public class XworkzRunner {
 public static void main(String[] args) {
	Institute institute = new Institute("Vinay Kumar",10,5,"BTM 1st Stage");
	System.out.println(institute.hrName);
	System.out.println(institute.noOfStaff);
	System.out.println(institute.noOfClassRoom);
	System.out.println(institute.location);
	
	
	System.out.println("*********************************************");
	
	Xworkz institute1 = new Xworkz("Amulya",15,10,"Rajajinagar");
	System.out.println(institute1.location);
	System.out.println(institute1.noOfStaff);
	System.out.println(institute1.noOfClassRoom);
	System.out.println(institute1.hrName);
}
}
