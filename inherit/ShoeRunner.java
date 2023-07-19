package com.xworkz.inherit;

public class ShoeRunner {
    public static void main(String[] args) {
    	
    	PumaShoe shoe2=new PumaShoe(4000,ShoeSize.SIX,ShoeColor.GREEN,"Puma Suede","Germany");
        shoe2.printInfo();
        
        NikeShoe shoe3=new NikeShoe(8000,ShoeSize.FIVE,ShoeColor.WHITE,"John D","Cristiano Ronaldo");
        shoe3.printInfo();
    }
}
    			
    			
    			
    			
    			