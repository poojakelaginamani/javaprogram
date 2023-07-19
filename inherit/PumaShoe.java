package com.xworkz.inherit;

public class PumaShoe extends Shoe {
   String model;
   String origin;
   

public PumaShoe(int price,ShoeSize size,ShoeColor color,String model,String origin) {
	super(price,size,color);
	
	this.model=model;
	this.origin=origin;
	
}
 
 void printInfo() {
	System.out.println(this.price);
	System.out.println(this.size);
	System.out.println(this.color);
	System.out.println(this.model);
	System.out.println(this.origin);
	
}

}
