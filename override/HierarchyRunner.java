package com.xworkz.override;

public class HierarchyRunner {
 public static void main(String[] args) {
System.out.println("-------------COURT------------");
	Court court =new Court();
	court.justice();
	
 System.out.println("-------------SUPREMECOURT------------");	
 SupremeCourt supremecourt = new SupremeCourt();
 supremecourt.justice();
 supremecourt.importantCase();
 
System.out.println("-------------HIGHCOURT------------");		
HighCourt high = new HighCourt();
high.criminalCase();
high.forgeryCase();
high.importantCase();

System.out.println("-------------CIVILCOURT------------");	
CivilCourt civil = new CivilCourt();
civil.criminalCase();
civil.forgeryCase();
civil.propertyCase();
civil.theftCase();

System.out.println("-------------FAMILYCOURT------------");	
FamilyCourt family = new FamilyCourt();
family.divorceCase();
family.propertyCase();
family.theftCase();
	
}
}
