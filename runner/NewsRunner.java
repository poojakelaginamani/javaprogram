package com.xworkz.runner;

import com.xworkz.encapsulation.Newspaper;

public class NewsRunner {
	public static void main(String[] args) 
	{
		System.out.println("Running main in News Paper Runner");
		
		Newspaper newsPaper = new Newspaper();
		
		System.out.println(newsPaper);
		
		newsPaper.setNewsPaper("Indian Express", "Indian Express ltd", "Viveck Goenka", 4.5, 3);
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(newsPaper);
	}
}
