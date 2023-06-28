public class NewPaper{
	public static void main(String[] args) {
	
     multiply(50,79); //executing with int , int 
     multiply(89,90,70); // executing with int , int,int  
     multiply(30,(byte)20,(short)40);//executing with int , byte, short 
     multiply(90,(float)0.2); // executing with int , float
     multiply(22.24); //executing with double 
     multiply((long)7896,(float)8.9,(byte)40);//executing with long, float,byte 
     getStudent(100,(byte)789);//executing with int , byte 
     getStudent("Pooja");//executing with String 
     getStudent("Rajeshwasri","Patil","Hubli");//executing with String, String, String 
     getStudent("Prajwal",(long)2342354324l,(int)047);//executing with String, long,int 
     getStudent((double)89.90,(byte)234542322);//executing with double , byte 
     getStudent((float)7.98,"Pooja","AgadiCollege");//executing with float, String, String 
     division(23,45);//executing with int,int
     division((double)89.90,(short)100);//executing with double,short 
     division(24.5f,67.8f,90.8f,89.7f);//executing with float,float,float,float 
     division((float)9.8,(byte)789);//executing with float, byte 
     division(56.56d,89.0978d,80.423d);//executing with double, double, double 
     division((short)56,(byte)123);//executing with float, String, String 
 }
 public static  int multiply(int value1,int value2){
 	int value3=value1*value2;
 	System.out.println("multiplied the numbers");
 	return value3;
 }
public static int multiply(int value1,int value2,int value3){
	int value4=value1*value2*value3;
	System.out.println("multipied three number");
	return value4;
}
public static int multiply(int value1,byte value2,short value3){
	int value4=value3;
	System.out.println("multiply the different datatypes");
	return value4;
}
public static float multiply(int value1,float value2){
	float value3 = value1*value2;
	System.out.println("multiply 2 numbers");
	return value3;
}
public static double multiply(double value1){
	double value2 = value1;
	System.out.println("print number");
	return value2;
}
public static long multiply(long value1,float value2,byte value3){
	long value4 = value1*value3;
	System.out.println("multiply numbers");
	return value4;
}
 public static int getStudent(int value1,byte value2){
	int value4=value1+value2;
	System.out.println("Get student list");
	return value4;
}
public static void getStudent(String name){
	
	System.out.println("Print Student name");
	
}
public static void getStudent(String name ,String lastname, String place){
	System.out.println("Student details");
}
public static void getStudent(String name,long phoneNo,int usn){
	System.out.println("Student details is invaild");
	
}
public static double getStudent(double value1,byte value2){
    double value3=value2;
	System.out.println("Student addmission number");
	return value3;
	}
	public static void getStudent(float cgpa,String name,String College){
	System.out.println("Student details is vaild");
	}
	public static int division(int value1,int value2){
		int value3=value1/value2;
		System.out.println("divided the numbers");
		return value3;
	}
	public static short division(double value1,short value2){
		short value3=value2;
		System.out.println("divide number");
		return value3;
	}
	public static float division(float value1,float value2,float value3,float value4){
		float value5=value1/value2/value3/value4;
		System.out.println("divided all values");
		return value5;
	}
	public static byte division(float value1,byte value2){
		byte value3=value2;
		System.out.println("divided the vaild numbers");
		return value3;
	}
	public static double division(double value1,double value2, double value3){
		double value4=value3/value2/value1;
		System.out.println("Print vaild numbers");
		return value4;
	}
	public static short division(short value1,byte value2){
		short value3=value1;
		System.out.println("divide numbers");
		return value3;
	}
}
