package com.xworkz.app.army;

public class Rules implements HospitalRule {
  
	@Override
	public void getMedicine() {
		System.out.println("Invoking the medicines in hosiptal.");
	}
    @Override
    public void getFee() {
    	System.out.println("Invoking the hospital Fees ");
    }

    
	
	
}
