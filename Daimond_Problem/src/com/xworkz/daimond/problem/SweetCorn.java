package com.xworkz.daimond.problem;

public class SweetCorn implements CheeseCorn,MasalaCorn{

	@Override
	public void spicy() {
	System.out.println("invoking masala corn is very spicy..");	
		
	}

	@Override
	public void weightLoss() {
		System.out.println("corn is used for low in fat..");	
			
	}

	@Override
	public void ingredients() {
		System.out.println("Ingredients are cheese , ghee, chilly ...");	
		
	}

	@Override
	public void carbohydrates() {
		System.out.println("corn contains the carbohydrate.....");	
		
	}

}
