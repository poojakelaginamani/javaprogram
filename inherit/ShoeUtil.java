package com.xworkz.inherit;

public class ShoeUtil {
 static void buy(Shoe shoe) {
		 if(shoe != null) {
				System.out.println("Price : "+shoe.price);
				System.out.println("Color : "+shoe.color);
				System.out.println("Size : "+shoe.size);
			}
			
			if(shoe instanceof PumaShoe) {
				PumaShoe pumashoe = (PumaShoe)shoe;
				pumashoe.printInfo();
			}
			
			if(shoe instanceof NikeShoe) {
				NikeShoe nikeshoe = (NikeShoe)shoe;
				nikeshoe.printInfo();
		  
			
			
		}
	 }
 }

