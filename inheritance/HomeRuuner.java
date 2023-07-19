package com.xworkz.inheritance;

public class HomeRuuner {

public static void main(String[] args) {
		
		Building building = new Building ("JK Super",2.6,"pink",5.5);

		System.out.println(building.cementBrand);
		System.out.println(building.height);
		System.out.println(building.color);
		System.out.println(building.expenditure);
		
		System.out.println("-----------------------------");
		
		Home home = new Home("Ultra Tech",3.7,"Silver",4.2);
		System.out.println(home.cementBrand);
		System.out.println(home.height);
		System.out.println(home.color);
		System.out.println(home.expenditure);
			
}
}