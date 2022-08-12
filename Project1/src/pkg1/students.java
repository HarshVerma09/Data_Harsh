package pkg1;

public class students {
	int age;
	int rollNo;
	public void display1()
	{
		System.out.println("Welcome to all ");
	}
	public void display2()
	{
		System.out.println("This is my first program ");
	}
	public static void main(String[] args) {
		students s =new students();
		s.display1();
		s.display2();
		s.age=21;
		System.out.println(s.age);
		s.rollNo=42;
		System.out.println(s.rollNo);
	}
}
