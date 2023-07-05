public class Train{
	public static void main (String[] agrs){

	

     //using literals

    String trainName = "vandebharat";
    String route = "BangloretoDhrawad";
    String trainSector = "EngineerSector";
    String businessDevelopment= "AnjaliGoyal";
    String directorName= "SanjayChander";
    String chairmanName = "AnilKumarLahoti";
    String exectiveDirector = "Ateesh";
    String privateSecretary = "PrakashSingh";
    String deputyStaff = "R K Sah";
    String sectionOfficer = "NutanMinj";


    //Using New Keywords
 String launching = new String("Feb15");
 String speed = new String("99mph");
 String trackGauge= new String("Indian gauge");
 String  designedBy= new String("Indic");
 String manufacturedBy = new String("Soudamini");
 String colour = new String("White");
 String wifi = new String("Onborad Wi-Fi");
 String classes = new String("Economy-Permium class");
 String seatingArrangements  = new String("Airline Style");
 String serviceType = new String("Intercity");

 // using methods
 String returnedValue = trainName.toUpperCase();
 System.out.println(returnedValue);
 
 String returnedValue1 = chairmanName.toLowerCase();
 System.out.println(returnedValue1);
  
 int results = sectionOfficer.compareToIgnoreCase("Nutan Minj");
 System.out.println(results);
 
 boolean numberValue = deputyStaff.endsWith("R K Sah");
 System.out.println(numberValue);
 
 String resulted = route.replace('D','B');
 System.out.println(resulted);
}
}
    




