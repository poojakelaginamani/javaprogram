package com.xworkz.override;

public class CivilCourt extends HighCourt{
 void propertyCase() {
	 System.out.println("invoking the arg properties cases");
 }
 void theftCase() {
	 System.out.println("invoking the arg theft cases");
 }

@Override
	void criminalCase() {
	System.out.println("invoking the arg Criminal Cases.");
	}
@Override
	void forgeryCase() {
	System.out.println("invoking the arg Forgery Cases.");
	}

}
