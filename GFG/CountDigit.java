package GFG;

public class CountDigit {

	public static int CountDigit(int a)
	{
		int d=0;
		while(a>0)
		{
			a=a/10;
			d++;
		}
		return d;
	}
	public static void main(String[] args) {
		System.out.println(CountDigit(343));
	}

}
