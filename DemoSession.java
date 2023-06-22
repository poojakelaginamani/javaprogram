public class DemoSession{
	public static void main(String[] args){

	

	number();
	marks();
	alphabets();
	display();
	mymethod();
	statements();


}
    public static void number(){
    long[] phoneNumber = {568989798l,3478790989l,347698787086l,57876786786L,799698678676l};
    
    for (int i=0; i<phoneNumber.length;i++)
    {
    	System.out.println(phoneNumber[i]);
    }
}

    public static void marks(){

   float[] cgpa = {7.9f,8.0f,5.6f,9.0f};
  
   for (int i=0; i<cgpa.length; i++)
  { 
 	System.out.println(cgpa[i]);
	
}
}

   public static void alphabets(){
   	char[] vowels = {'a','e','i','o','u'};
   	
   		for (int i=0; i<vowels.length;i++)
   		{
   			System.out.println(vowels[i]);
   		}
   	}
   
  
   
     public static void display(){
     byte[] age = {22,34,02,45,60,56};
     
     	for (int i=0; i<age.length;i++) 
     	{
     	System.out.println(age[i]);	
     	}
     }

      public static void mymethod(){
      	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      	
          
      		for (int i=0; i<cars.length;i++)
      		{
      			System.out.println(cars[i]);
      		}
      	}
      public static void statements(){
      	boolean[] isClassOver = new boolean[5];
      	isClassOver[0] = true;
      	isClassOver[1] = false;
      	isClassOver[2] = true;
      	isClassOver[3] = false;
      	isClassOver[4] = false;
      	for (int i=0; i<isClassOver.length;i++ ) {
      		System.out.print(isClassOver[i]);
      		
      	}
      }

}