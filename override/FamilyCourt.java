package com.xworkz.override;

public class FamilyCourt extends CivilCourt{
  void divorceCase() {
	  System.out.println("invoking the args of divorce cases");
  }

  
  
  @Override
	void propertyCase() {
	  System.out.println("invoking the arg properties cases");	
	}
  
  @Override
	void theftCase() {
	  System.out.println("invoking the arg theft cases");
	}
}
