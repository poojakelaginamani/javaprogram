package com.xworkz.encapsulation;

public class Dosa {
	
		
		private String variety;
		private double price;
		private boolean withPalya;
		private String hotelName;
		private boolean takeAway;
		
		//getters
		public String getHotelName() {
			return hotelName;
		}
		public double getPrice() {
			return price;
		}
		public String getType() {
			return variety;
		}
		public boolean getWithPalya() {
			return withPalya;
		}
		public boolean getTakeAway() {
			return takeAway;
		}
		
		//setters
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void setTakeAway(boolean takeAway) {
			this.takeAway = takeAway;
		}
		public void setType(String variety) {
			this.variety = variety;
		}
		public void setWithPalya(boolean withPalya) {
			this.withPalya = withPalya;
		}
		 
		//toString method
		public String toString() {
			return " hotelName = "+ hotelName +"\n"+ " dosaPrice =  "+ price +"\n"+ " dosaWithPalya =  "+ 
							withPalya +"\n"+ " dosaType =  "+ variety +"\n"+ " takeAway = "+ takeAway  ;
		}
		
	}
   

