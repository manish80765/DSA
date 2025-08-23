package GFG;

public class SumofDigitsofaNumber {

	public static int SumofDigit(int a)
	{
		int sum=0;
		while(a>0)
		{
			sum+=a%10;
			a=a/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(SumofDigit(24));
	}

}
