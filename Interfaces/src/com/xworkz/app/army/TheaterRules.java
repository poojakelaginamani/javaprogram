package com.xworkz.app.army;

public class TheaterRules implements Theater {

	@Override
	public void donttake_Outside_Food() {
		System.out.println("Invoking the theaters dont allow the outside food");
	}

	@Override
	public void getMaintance_Clean() {
		System.out.println("Invoking the keep mainatance clean in theater");
	}

}
