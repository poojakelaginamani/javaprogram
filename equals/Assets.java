package com.xworkz.equals;

public class Assets {
    private String landOwner;
    private long tax;
    private double totalLand;
	
	
	public Assets(String landOwner, long tax, double totalLand) {
		this.landOwner=landOwner;
		this.tax=tax;
		this.totalLand=totalLand;
	}
	public String getLandOwner() {
		return landOwner;
	}
    public long getTax() {
		return tax;
	}
    public double getTotalLand() {
		return totalLand;
	}
    public void SetLandOwner(String landOwner) {
    	this.landOwner=landOwner;
    }
    public void SetTax(long tax) {
    	this.tax=tax;
}
    public void SetTotalLand(double totalLand) {
    	this.totalLand=totalLand;
    }
    @Override
    public String toString() {
    	return "Assets=" + landOwner + "\n" + "Tax=" + tax + "\n" + "TotalLand=" + totalLand;
    }
	
    @Override
    public boolean equals(Object obj) {
		
		if(obj!= null) {
			System.out.println("Object not null checked");
			if(obj instanceof Assets) {
				System.out.println("Object type matched");
				Assets casted = (Assets)obj;
				if(this.landOwner == casted.landOwner && this.tax == casted.tax && this.totalLand==totalLand){
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


    	
    	
    	
    	
