package com.xworkz.encapsulation;

public class Calculator {
		
		private String type;
		private int price;
		private boolean isScientific;
		private String color;
		private String brandName;
		
		//getters
		public String getbrandName() {
			return brandName;
		}
		public int getPrice() {
			return price;
		}
		public String getType() {
			return type;
		}
		public boolean getisScientific() {
			return isScientific;
		}
		public String getColor() {
			return color;
		}
		
		//setters
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void setIsScientific(boolean isScientific) {
			this.isScientific = isScientific;
		}
		 
		//toString method
		public String toString() {
			return " brandName = "+ brandName +"\n"+ " calculatorPrice =  "+ price +"\n"+ " calculatorisScientific=  "+ 
					isScientific +"\n"+ " calculatorType =  "+ type +"\n"+ " color = "+ color;
		}
			}

