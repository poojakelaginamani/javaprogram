package com.xworkz.app.army;

public class TemplesRule implements Temple {

	
	@Override
	public void getDontTakePicture() {
		System.out.println("Don't take the photo in temple");
	}
	 @Override
	public void getKeepSilent() {
		 System.out.println("keep Silent maintainces in temple");
	}
}
