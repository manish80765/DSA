package GFG;

public class CheckPalindrome {
	public static boolean checkPalindrome(int a )
	{
		if(a>0&&a<=9)
		{
			return true;
		}
		int num=0;
		int d=a;
		while(a>0)
		{
			num=num*10;
			num=num+a%10;
			a=a/10;
		}
		if(num==d)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		System.out.println(checkPalindrome(343));
	}
}
