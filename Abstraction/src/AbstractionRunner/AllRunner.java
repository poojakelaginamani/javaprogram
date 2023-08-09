package AbstractionRunner;

import com.xworkz.abstraction.app.*;

public class AllRunner {
     public static void main(String[] args) {
    	System.out.println("Running Main in Printing Machine......");
    	
    	PrintingMachine machine = new Printing();
    	machine.print();
    	
    	Stereo  stereo = new Stereo(machine);
    	stereo.getPrint();
    	
    	System.out.println("Running Main in Smart watchs......");
    	
    	SmartWatch watch = new Watch();
    	watch.showTime();
    	
    	Noise noise = new Noise(watch);
    	noise.getShowTime();
    	
    	System.out.println("Running Main in Laptop......");
    	
    	Laptop laptop = new Hp();
    	laptop.display();
    	
    	DeepikaPadukone deepika = new DeepikaPadukone(laptop);
    	deepika.getdiplay();
    	
    	System.out.println("Running Main in Elevator......");
    	
    	Elevator elevator = new Delta();
    	elevator.carryLuggage();
    	
    	WalterGuderian walter = new WalterGuderian(elevator);
    	walter.getCarryLuggage();
    	
    	System.out.println("Running Main in Washing Machine......");
    	
    	WashingMachine wash = new Samsung();
    	wash.clean();
    	
    	Priyanka priya = new Priyanka(wash);
    	priya.getClean();
   
    	System.out.println("Running Main in Water Purifier......");
    	
    	WaterPurifier water = new BlueStar();
    	water.filter();
    	
    	Virat virat = new Virat(water);
    	virat.getFilter();
    	
    	System.out.println("Running Main in Kidney......");
    	
    	Kidney function = new Human();
    	function.cleans();
    	
    	WasteProducts waste = WasteProducts(function);
    	waste.getCleans();
    	
     }

	
}
