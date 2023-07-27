package com.xworkz.encapsulation;

public class Satelliete {
		
		private String name;
		private double price;
		private long speed;
		private String application;
		private String launch;
		
		//getters
		public String getName() {
			return name;
		}
		public double getPrice() {
			return price;
		}
		public long getSpeed() {
			return speed;
		}
		public String getApplication() {
			return application;
		}
		public String getLaunch() {
			return launch;
		}
		
		//setters
		public void setLaunch(String launch) {
			this.launch = launch;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void setSpeed(long speed) {
			this.speed = speed;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setApplication(String application) {
			this.application = application;
		}
		 
		//toString method
		public String toString() {
			return " Launch = "+ launch +"\n"+ " satellietePrice =  "+ price +"\n"+ " satellieteSpeed =  "+ 
							speed +"\n"+ "satellieteName =  "+name +"\n"+ "satellieteApplication = "+ application;
		}
		
		
	}

