package com.xworkz.village;

import com.xworkz.village.inner.OldVillage;
import com.xworkz.village.outer.NewVillage;

public class RunnerMain {
    public static void main(String[] args) {
		OldVillage old = new OldVillage();
		old.enter();
		old.exit();
	
    NewVillage newvillage = new NewVillage();
    newvillage.exit();
    newvillage.enter();
}
}