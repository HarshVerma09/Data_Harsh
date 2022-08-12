package pkg1;

public class Arithmatic1 
{
  public int sum(int a,int b)
  {
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
  }
  public int sub(int d,int e)
  {
	  int f;
	  f=d-e;
	  System.out.println("sub rsult is "+f);
	  return f;
  }
  public int multi(int g,int h)
  {
	  int i;
	  i=g*h;
	  System.out.println("mul result is "+i);
	  return i;
  }
  public void div(int j,int k)
  {
	  int l;
      l=j/k;
      System.out.println("final result is "+l);
  }
  public static void main(String[] args)
  {
	Arithmatic1 obj=new Arithmatic1();
	int sumResult =obj.sum(10, 2);
	int sumResult2 =obj.sum(sumResult, 2);
	int subResult =obj.sub(sumResult2, 2);
	int multiResult =obj.multi(subResult, 2);
	obj.div(multiResult, 2);
}
}
