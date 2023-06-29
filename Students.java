public class Students{
int id;
String name;
float height;
long phoneNumber;
double percentage;

  public Students()
  {
        System.out.println("Students Details");
		System.out.println(id);
		System.out.println(name);
		System.out.println(height);
		System.out.println(phoneNumber);
		System.out.println(percentage);
} 
public Students(int id1 , String name1 , float height1 , long phoneNumber1 , double percentage1)
{
	System.out.println("Students Details is invalid");
	id=id1;
	name=name1;
	height=height1;
	phoneNumber=phoneNumber1;
	percentage=percentage1;
}


		public static void main(String[] args)
	{
		new Students();
		System.out.println("!___________________________________________________!");
		Students students = new Students(023,"Pooja",4.5f,2342543238L,89.90d);
		System.out.println(students.id);
		System.out.println(students.name);
		System.out.println(students.height);
		System.out.println(students.phoneNumber);
		System.out.println(students.percentage);
	}
}
	

