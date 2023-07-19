package com.xworkz.inheritance;

public class RunnerJava {
public static void main(String[] args) {
		
		Dog dog=new Dog("Bulldog",12,true);

		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.isBreed);
		
		System.out.println("-----------------------------");
		
		Animal dog1 = new Dog("Mongrel",16,false);
		System.out.println(dog1.isBreed);
		System.out.println(dog1.name);
		System.out.println(dog1.age);
		
}
}
