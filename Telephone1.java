	public class Telephone1{
	public static void main(String[] args) {
	
    int addedValue = add(30,50);
    System.out.println(addedValue);
    boolean returnResult = isPrimeNum(10);
    System.out.println(returnResult);
    boolean returnValued =voting(18);
    System.out.println(returnValued);
    boolean returnedResult=marks(9.5F);
	System.out.println(returnedResult);
	boolean returnedValue=accountNum(144647564664L);
	System.out.println(returnedValue);
	double returnPieValue=pieValue(3.1433D,3.1477D);
	System.out.println(returnPieValue);
	float numberValue=temperature(25.0f,27.5f);
	System.out.println(numberValue);
	int mulValued = multiple(22,27);
	System.out.println(mulValued);
    char returncharacter=car("BMW");
	System.out.println("returncharacter");
	double numberedValue=massOfElectron(9.1093837d,9.2007856d);
   System.out.println(numberedValue);
	}

public static int add(int a, int b){
int c = a+b;
return c;
}
public static boolean isPrimeNum(int number){
if(number%2==0)
{
	System.out.println("Number is a Prime number");
	return true;
}
else {
	System.out.println("Number is not a Prime number");
	return false;
}
}
public static boolean voting(int age){
	if(age>=18){
			System.out.println("eligible for voting");
			return true;
		}
		else{
			System.out.println("not eligible for voting");
			return false;
		}
	}
public static boolean marks(float cgpa){
		if(cgpa>=9.5F){
			System.out.println("Excellent marks");
			return true;
		}
		else{
			System.out.println("First class");
			return false;
		}
	}
	
public static boolean accountNum(long number){
		if(number>=14){
			System.out.println("Account number is valid");
			return true;
		}
		else{
			System.out.println("Account number is invalid");
			return false;
		}
	}

public static double pieValue(double D1,double D2){
		if(D2<=3.14D){
			System.out.println("PieValue is greater than 3.14");
			return D1;
		}
		else{
			System.out.println("PieValue is lesser than 3.14");
		    return D2;
		}
	}
	
	public static float temperature(float t1,float t2){
		if(t1 >=24.9f){
			System.out.println("temperature is too high");
			return t1;
		}
		else{
			System.out.println("gravity is too low");
			return t2;
		}
	}
public static int multiple(int x, int y ){
int multiple = x*y;
return multiple;
}
public static char car(String c){
		if(c == "BWM"){
			System.out.println("car is Scooty");
			return 'c';
		}
		else{
			System.out.println("car is BMW");
			return 'v';
		}
	}

public static double massOfElectron(double d1,double d2){
		if(d1==9.1093837d){
			System.out.println("massOfElectron is equal to 9.1093837");
			return d1;
		}
		else{
			System.out.println("massOfElectron is not equal to 9.1093837");
		    return d2;
}
}

}
	
