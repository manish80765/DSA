package String;

import java.util.HashSet;

public class gcdOfStrings {
	public static  String gcdOfStrings(String str1, String str2) {
        // Check if concatenating in both orders gives the same result
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
         /*HashSet<Character> st = new HashSet<Character>();
		 int i=str1.length()>str2.length()?str2.length():str1.length();
	//	 System.out.print(i);
		 for(int j=0; j<i; j++)
		 {
			 
			 if(str1.charAt(j)==str2.charAt(j))
			 {
				// System.out.println(str1.charAt(j));
				// System.out.println(str2.charAt(j));
				 st.add(str2.charAt(j));
				 System.out.println(st);
			 }
			 else {
				 break;
			 }
		 }
		 StringBuilder st1= new StringBuilder();
		 for(char x: st)
		 {
			 System.out.println(x);
			 st1.append(x);
		 }
	      return st1.toString(); -*/
    }
	    
	 public static void main(String[] srgs) {
		 String str1 = "AAABC";
		 String str2 = "A";
		 System.out.println(gcdOfStrings(str1, str2));
		 
	 }
}
