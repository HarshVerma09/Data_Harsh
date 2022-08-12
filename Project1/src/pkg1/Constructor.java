package pkg1;

public class Constructor 
{
   public Constructor()
   {
	System.out.println("It's a Default Constructor. ");
}
   public Constructor(int a)
   {
	System.out.println("It's One Parameterized Constructor. ");
}
   public Constructor(int a, int b)
   {
	System.out.println("It's Two Parameterized Constructor. ");
}
   public Constructor(int a, int b, int c)
   {
	System.out.println("It's Three Parameterized Constructor. ");
}
   public Constructor(int a, int b, int c, int d)
   {
	System.out.println("It's Four Parameterized Constructor. ");
}
   public static void main(String[] args) 
   {
	Constructor cons1=new Constructor(12,13,4,6);
	Constructor cons2=new Constructor();
	Constructor cons3=new Constructor(10);
	Constructor cons4=new Constructor(5,7);
	Constructor cons5=new Constructor(20,65,43);	
}
}
