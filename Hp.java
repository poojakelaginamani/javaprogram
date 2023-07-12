public class Hp{
	String brandName;
    Processors type=Processors.INTEL;

    final static String operatingSystem="Window";
    final static String cameraPosition="Center";

	public static void main(String[] args){
    System.out.println("Print the Main Method");

     Hp hp = new Hp();
     
     hp.brandName ="Pavilion";	
     System.out.println(Hp.operatingSystem);
     System.out.println(hp.cameraPosition);
	System.out.println(hp.brandName);
	String result1="Radeon";
	boolean finalResult=result1.equals(hp.type.getValue());
	System.out.println(finalResult);


     Mobile phone = new Mobile();
    
    phone.name="iPhone";
    System.out.println(Mobile.dataAccess);
    System.out.println(Mobile.embedded);
    System.out.println(phone.name);
    String resulted="Lcd";
    boolean finalResulted = resulted.equals(phone.module.getValue());
    System.out.println(finalResulted);

    }

   

 public enum Processors{

	INTEL("Intel"),RYZEN("Ryzen");

	String value;
	Processors(String value){
		this.value=value;

	
	
}
public String getValue(){
	  return this.value;
	}

}
}
class Mobile{
	String name;
	DisplayType module=DisplayType.LCD;

	final static String dataAccess="Internet access";
	final static String embedded ="Memory";
      

 public enum DisplayType{
 	LCD("Lcd"), OLED("Oled");
 	 String value;
 	 DisplayType(String value){
 	 	this.value=value;
 	 }
     public String getValue(){
     	return this.value;
     }

 }	
}