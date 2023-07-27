package com.xworkz.runner;

import com.xworkz.encapsulation.Calculator;

public class CalculatorRun {

		public static void main(String[] args) {

			System.out.println("Running main in Calculator Runner");
			
			Calculator calculator = new Calculator();
			
			System.out.println(calculator);
			
			calculator.setBrandName("Casio");
			calculator.setPrice(1000);
			calculator.setIsScientific(true);
			calculator.setType("Scientific");
			calculator.setColor("Silver");
			
			System.out.println("* * * * * * * * * * * * * * * * * *");
			
			System.out.println(calculator);
		}

	}

		