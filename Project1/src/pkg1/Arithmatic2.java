package pkg1;

public class Arithmatic2 
{
public int sub(int a,int b) {
int c;
c=a-b;
System.out.println("sub result is "+c);
return c;
}
public int sum(int d,int e)
{
	int f;
	f=d+e;
	System.out.println("sum result is "+f);
	return f;
}
public int multi(int g, int h)
{
	int i;
	i=g*h;
	System.out.println("multi result is "+i);
	return i;
}
public void div(int j, int k)
{
	int l;
	l=j/k;
	System.out.println("Final result is "+l);
}
public static void main(String[] args)
{
Arithmatic2 obj =new Arithmatic2();
int subResult =obj.sub(10, 2);
int sumResult =obj.sum(subResult, 2);
int subResult2 =obj.sub(sumResult, 2);
int multiResult =obj.multi(subResult2, 2);
obj.div(multiResult, 2);
}
}
