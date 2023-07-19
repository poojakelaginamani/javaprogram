package com.xworkz.override;

public class HighCourt extends SupremeCourt {
 void criminalCase() {
	 System.out.println("invoking the arg Criminal Cases.");
}
  void forgeryCase() {
	  System.out.println("invoking the arg Forgery Cases.");
  }

@Override
	void importantCase() {
	System.out.println("invoking the arg important Cases.");	

	}
}
