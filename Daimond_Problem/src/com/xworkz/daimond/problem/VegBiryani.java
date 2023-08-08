package com.xworkz.daimond.problem;

public class VegBiryani implements  ChickenBiryani, MuttonBiryani{

	@Override
	public void masala() {
	System.out.println("invoking masala in mutton briyani");	
	}

	@Override
	public void price() {
		System.out.println("invoking price in chicken briyani....");		
	}

	@Override
	public void taste() {
		System.out.println("invoking tasty in chicken briyani...");		
	}

	@Override
	public void location() {
		System.out.println("invoking location of biryani house....");	
	}

	@Override
	public void variety() {
		System.out.println("invoking the variety of briyani.........");	
		
	}


}