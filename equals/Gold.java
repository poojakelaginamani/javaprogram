package com.xworkz.equals;

public class Gold {
	String shopName;
	long price;
	String quality;
	String design;
	public Gold(String shopName, long price, String quality, String design) {
		this.shopName = shopName;
		this.price = price;
		this.quality = quality;
		this.design = design;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	@Override
	public String toString() {
		return "Gold="+ shopName +"\n" + "Cost="+ price + "\n" + "Quality="+ quality + "\n" + "Design=" + design; 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("Both object are not same");
			if(obj instanceof Gold) {
				System.out.println("Both object type is matched");
				Gold Casted=(Gold)obj;
				if(this.shopName==Casted.shopName && this.price==Casted.price && this.quality==Casted.quality && this.design==design) {
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
