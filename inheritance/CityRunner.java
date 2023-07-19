package com.xworkz.inheritance;

public class CityRunner {
public static void main(String[] args) {
		
		City place = new City("Banglore",74.1d,546);

	   System.out.println(place.cityName);
		System.out.println(place.sqkm);
		System.out.println(place.noOfAreas);

		System.out.println("-----------------------------");
		
		City place1 = new Bengaluru("Mysore",7.54d,453);
		System.out.println(place1.cityName);
	    System.out.println(place1.noOfAreas);
	    System.out.println(place1.sqkm);
			
}
}
