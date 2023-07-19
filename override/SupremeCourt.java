package com.xworkz.override;

public class SupremeCourt extends Court {
  void importantCase() {
	System.out.println("invoking arg of important cases");  
  }
 
 @Override
 void justice() {
	 System.out.println("invoking the args of override");
 }




}
