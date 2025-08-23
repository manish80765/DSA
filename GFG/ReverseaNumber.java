package GFG;

public class ReverseaNumber {

	public static int ReverseNumber(int a)
	{
		int reverse=0;
		while(a>0)
		{
			reverse=reverse*10;
		    reverse=reverse+a%10;	
		    a=a/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		System.out.println(ReverseNumber(342));
	}

}
