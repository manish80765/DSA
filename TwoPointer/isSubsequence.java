package TwoPointer;

public class isSubsequence {

public static boolean isSubsequence(String s, String t) {
	if(s.isEmpty())
	{
		return false;
	}
	boolean a=false;
	int c=0;
	for(int i=0; i<t.length()&&c<s.length(); i++) {
		
		if(s.charAt(c)==t.charAt(i))
		{
			a=true;
			c++;
		}
	}
	if(c==s.length() && a==true)
	{
		return true;
	}
	else {
	return false;
	}
    }
	public static void main(String[] args) {
		String s="b";
		String a="abc";
		System.out.println(isSubsequence(s,a));
	}

}
