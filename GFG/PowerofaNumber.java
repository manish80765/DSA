package GFG;

public class PowerofaNumber {
	public static int PowerofaNumber(int a, int power)
	{
		int n=1;
		for(int i=0;i<power;i++)
		{
			n=n*a;
		}
		return n;
	}
	public static void main(String[] args)
	{
		System.out.println(PowerofaNumber(3,2));
	}

}
