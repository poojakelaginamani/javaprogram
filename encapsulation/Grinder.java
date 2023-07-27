package com.xworkz.encapsulation;

public class Grinder {
   private String brandName;
   private double price;
   private boolean isWarrenty;
   private double speed;
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isWarrenty() {
	return isWarrenty;
}
public void setWarrenty(boolean isWarrenty) {
	this.isWarrenty = isWarrenty;
}
 public double getSpeed() {
	 return speed;	 
 }
 public void setSpeed(double speed) {
	 this.speed=speed;
 }
 @Override
	public String toString() {
		return "brandName is = " + brandName + "\n" + "price is = " + price + "\n" + " Warrenty = " + isWarrenty
				+ "\n" + "speed is Rs = " + speed ;
	}
}
