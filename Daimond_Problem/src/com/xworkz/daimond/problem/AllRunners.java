package com.xworkz.daimond.problem;

public class AllRunners {
  public static void main(String[] args) {
	
	  
	  BtmCoolDrinks cool = new BtmCoolDrinks();
	  cool.brand();
	  cool.cold();
	  cool.energy();
	  cool.flavors();
	  cool.onPrice();
	  cool.price();
	  cool.origin();
	  cool.stamina();
	  cool.variants();
	  cool.types();
	  
	  
	  PepsiCoolDrinks pepsi = new BtmCoolDrinks();
	  pepsi.cold();
	  pepsi.energy();
	  pepsi.price();
	  pepsi.onPrice();
	  pepsi.types();
	  pepsi.origin();
	  
	  CokeCoolDrinks coke = new BtmCoolDrinks();
	  coke.brand();
	  coke.cold();
	  coke.stamina();
	  coke.price();
	  coke.types();
	  coke.variants();
	  coke.flavors();
	  
	  CoolDrinks drinks = new BtmCoolDrinks();
	  drinks.cold();
	  drinks.price();
	  drinks.types();
	  
	  
     VegBiryani veg = new  VegBiryani();
	 veg.taste();
	 veg.location();
	 veg.masala();
	 veg.price();
	 veg.variety();
	 
	 ChickenBiryani chicken  = new  VegBiryani();
	 chicken.price();
	 chicken.variety();
	 chicken.location();
	 chicken.taste();
	 MuttonBiryani mutton  = new  VegBiryani();
	 mutton.location();
	 mutton.variety();
	 mutton.masala();
	 
	 Biryani biryani  = new  VegBiryani();
	 biryani.location();
	 biryani.variety();
	 
	SweetCorn sweet = new  SweetCorn();
	sweet.carbohydrates();
	sweet.ingredients();
	sweet.spicy();
	sweet.weightLoss();
	
	CheeseCorn cheese = new SweetCorn();
	 cheese.carbohydrates();
	 cheese.ingredients();
	 cheese.weightLoss();
	 
	 MasalaCorn masala = new SweetCorn();
	 masala.carbohydrates();
	 masala.spicy();
	 masala.weightLoss();
	 
	 Corn corn = new SweetCorn();
	 corn.carbohydrates();
	 corn.weightLoss();
	 
	 
}
}
