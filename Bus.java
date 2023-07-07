public class Bus{
	
static String BusName ;
static String Route;
static String coachType;
static String type;
static String services;

long noOfEmployees;
int divisions;
String headQuarters;
int fleetSize;
long salary;


public static void main(String[] args){
		Bus bus= new Bus(35492l,15,"Banglore",118,30000l);
		System.out.println(bus.noOfEmployees);

		Bus bus1 = new Bus(354977l,16,"Mysore",119,25000l);
		System.out.println(bus1.divisions);
		
		Bus bus2 = new Bus(403358l,10,"Kolar",120,35000l);
		System.out.println(bus2.headQuarters);
		
		Bus bus3 = new Bus(4654454l,12,"Hassana",100,450000l);
		System.out.println(bus3.fleetSize);
		
		Bus bus4 = new Bus(364876l,11,"Mangaluru",110,500000l);
		System.out.println(bus4.salary);
		}

		public Bus(long noOfEmployees, int divisions, String headQuarters, int fleetSize , long salary){
		this.noOfEmployees=noOfEmployees;
		this.divisions=divisions;
		this.headQuarters=headQuarters;
		this.fleetSize=fleetSize;
		this.salary=salary;
		
		
		}
}