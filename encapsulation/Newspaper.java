package com.xworkz.encapsulation;

public class Newspaper {
	private String name;
	private String factoryName;
	private String ownerName;
	private double price;
	private double dispatchTime;
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public double DispatchTime() {
		return dispatchTime;
	}
	
	public void setNewsPaper(String name, String factoryName, String ownerName, double price, double dispatchTime)
	{
		this.dispatchTime = dispatchTime;
		this.factoryName = factoryName;
		this.name = name;
		this.price = price;
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return "News Paper Name is = " + name + "\n" + "Factory name is = " + factoryName + "\n" + 
				"Owner Name is = " + ownerName + "\n" + " News Paper price is Rs = " + price + "\n" + 
				"Disaptch Time in AM is = " + dispatchTime;
	}

}