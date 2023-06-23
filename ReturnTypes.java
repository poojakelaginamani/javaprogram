public class ReturnTypes{
	public static void main(String[] args) {
        byte returnedValue = colorInRainbow();
        System.out.println(returnedValue);
		int returnValue = populationOfIndia();
		System.out.println(returnValue);
        short returnedNumber = speedOfAeroplane();
        System.out.println(returnedNumber);
        long returnNumber = accountNo();
        System.out.println(returnNumber);
        Double measuredValue = massOfNeutron();
        System.out.println(measuredValue);
        float temperatureValue = temperature();
	    System.out.println(temperatureValue);
        char alphabetsValue = consontant();
        System.out.println(alphabetsValue);
        boolean statementValue = checkTheNo();
	    System.out.println(statementValue);
	      int  methodValue = add();
	    System.out.println(methodValue);
	    String letterValue = car();
	    System.out.println(letterValue);
	    double[] classValue = pieValue();
	    System.out.println(classValue);
	}

	public static byte colorInRainbow(){
		byte colorInRainbow = 7;
		return colorInRainbow;
	}

	public static int populationOfIndia(){
	int populationOfIndia = 1440000000;
	
		return populationOfIndia;
      }
      
    public static short speedOfAeroplane(){
    	short speedOfAeroplane = 575;
    	return speedOfAeroplane;
    }
    public static long accountNo(){
       long	accountNo = 3453566463l;
    return accountNo;
}

    public static double massOfNeutron(){
    	double massOfNeutron = 1.67492749804D;
    	 
    	 return massOfNeutron;

    }
     public static float temperature(){
      float temperature = 22.0F;

      return temperature;
     }
     public static char consontant(){
     	char consontant = 'b';
     	return consontant;
     }
      public static boolean checkTheNo(){
      	int num =-10;
      	if(num>=10){
      		return true;
      	}
      	else {
      		return false;
      	}
      }
     public static int add(){
        int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
   
     public static String car(){
      	String car = "BMW";
      	return car;
      }
          
    public static  double[] pieValue(){
		double[] pieValue = {3.1478976878d,4.57576576d,9.02464646576d,7.5464d};

			return pieValue;
			
		}
	
   
  
}

