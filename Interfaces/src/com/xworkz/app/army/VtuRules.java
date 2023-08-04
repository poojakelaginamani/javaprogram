package com.xworkz.app.army;

public class VtuRules implements VTU {

	@Override
	public void getStudent_Info() {
		System.out.println("Invoking the VTU in Student information");	
	}

	@Override
	public void getPass() {
		System.out.println("Invoking the Vtu in Student pass details");
	}

}
