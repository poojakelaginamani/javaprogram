package com.xworkz.runner;

import com.xworkz.equals.Assets;

public class AssetsRun {
 public static void main(String[] args) {
	 
	 System.out.println("Ruuning the main in Assets");
      Assets asset1 = new Assets("John",345334l,4.5d);
      Assets asset2 = new Assets("John",345334l,4.5d);

      System.out.println("Object 1 : \n" + asset1 +"\n");
      System.out.println("Object 2 : \n" + asset2 + "\n");
      
      boolean result = asset1.equals(asset2);
      System.out.println("The assets being same is:" + result);
}
}

