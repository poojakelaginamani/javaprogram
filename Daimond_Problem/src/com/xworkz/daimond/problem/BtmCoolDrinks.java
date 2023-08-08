package com.xworkz.daimond.problem;

public class BtmCoolDrinks implements PepsiCoolDrinks , CokeCoolDrinks{

	@Override
	public void stamina() {
	System.out.println("invoking the stamina in coke drinks");	
	}

	@Override
	public void flavors() {
		System.out.println("invoking the flavours in Coke");	
			}

	@Override
	public void brand() {
		System.out.println("invoking the brand in coke cool drinks");	
		
	}

	@Override
	public void variants() {
		System.out.println("invoking the variants like Diet coke , Diet coke caffeine-free");	
	}

	@Override
	public void energy() {
		System.out.println("invoking the energy in Pepsi cool drinks");	
	}

	@Override
	public void onPrice() {
		System.out.println("invoking the on prices....");	
	}

	@Override
	public void origin() {
		System.out.println("invoking the origin on brand....");	
		
	}

	@Override
	public void cold() {
		System.out.println("invoking the cold in cool drinks....");	
	}

	@Override
	public void types() {
		System.out.println("invoking the types of cool drinks..");	
	}

	@Override
	public void price() {
		System.out.println("invoking the price of the cool drinks...");	
	}
  
}
