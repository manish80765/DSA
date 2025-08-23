package GFG;

public class FibonacciSeries {
public static void FibonacciSeries(int a)
{
	int b=0;
	int c=1;
	System.out.print(b+" "+c+" ");
	int d=b+c;
	System.out.print(d+" ");
	for(int i=0; i<a; i++)
	{
		b=c;
		c=d;
		d=b+c;
		System.out.print(d+" ");
	}
	
}
public static void main(String[] args)
{
	FibonacciSeries(8);
}
}
