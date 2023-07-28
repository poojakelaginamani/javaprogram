package com.xworkz.equals;

public class Grocery {
    private String fruits;
     private String vegtables;

	public Grocery(String fruits, String vegtables) {
		this.setFruits(fruits);
		this.setVegtables(vegtables);
	}
	
	public String getFruits() {
		return fruits;
	}
	
	public void setFruits(String fruits) {
		this.fruits = fruits;
	}
	
	public String getVegtables() {
		return vegtables;
	}

	public void setVegtables(String vegtables) {
		this.vegtables = vegtables;
	}
	@Override
	public String toString() {
		return "Grocery= " + fruits + "\n" + "vegtables=" + vegtables ;
		}
	
	@Override
      public boolean equals(Object obj) {
		
		if(obj!= null) {
			System.out.println("Object not null checked");
			if(obj instanceof Grocery) {
				System.out.println("Object type matched");
				Grocery casted = (Grocery)obj;
				if(this.fruits == casted.fruits && this.vegtables == casted.vegtables) {
					System.out.println("Both objects are same");
					return true;
				}
				else {
					System.err.println("Both objects are not same");
				}
			}
			else {
				System.err.println("Objects type mis-matched");
			}
		}
		else {
			
			System.err.println("Object is null cant compare");
			
		}
			return false;
	}
}

