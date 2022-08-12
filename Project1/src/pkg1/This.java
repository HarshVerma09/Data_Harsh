package pkg1;

public class This 
{
  public This() 
  {
	  this(7,8,9);
	System.out.println("It's a Default Constructor ");
}
  public This(int a) 
  {
	  this(12,13,14,15);
	System.out.println("It's One Parameterized Constructor ");
}
  public This(int a, int b) 
  {
	  this(5);
	System.out.println("It's Two Parameterized Constructor ");
}
  public This(int a, int b, int c) 
  {
	System.out.println("It's Three Parameterized Constructor ");
}
  public This(int a, int b, int c, int d) 
  {
	  this();
	System.out.println("It's Four Parameterized Constructor ");
}
  public static void main(String[] args) {
	This th=new This(11,10);
}
}
