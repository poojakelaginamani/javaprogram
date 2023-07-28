package com.xworkz.equals;

public class Vechicle {
 private String type;
 private  double cost;
 private String brandName;
 private int speed;
 private  String fuels;
public Vechicle(String type, double cost, String brandName, int speed, String fuels) {
	this.type = type;
	this.cost = cost;
	this.brandName = brandName;
	this.speed = speed;
	this.fuels = fuels;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getFuels() {
	return fuels;
}
public void setFuels(String fuels) {
	this.fuels = fuels;
}
@Override
public String toString() {
	return "Vechicle="+ type +"\n" + "Cost="+ cost + "\n" + "BrandName="+ brandName + "\n" + "Speed=" + speed + "\n"+ "Oils="+ fuels; 
}
@Override
public boolean equals(Object obj) {
	if(obj!=null) {
		System.out.println("Both object are not same");
		if(obj instanceof Vechicle) {
			System.out.println("Both object type is matched");
			Vechicle Casted=(Vechicle)obj;
			if(this.type==Casted.type && this.cost==Casted.cost && this.brandName==Casted.brandName && this.speed==speed && this.fuels==Casted.fuels) {
		  return true;
			}
			else {
				System.err.println("both object are not same");
			}
	}
		else {
			System.err.println("both object is mis-matched");
		}
	}
	else {
		System.out.println("both object is null cannot same");
	}
	return false;
	
}




}

