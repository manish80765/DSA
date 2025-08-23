package GFG;

public class GCDusingRecursion {

	public static int GCD(int a, int b)
	{
		if (b!= 0)
	        return GCD(b, a % b);
	    else
	        return a;
	}
	public static void main(String[] args) {
		System.out.println(GCD(8,6));
	}

}
