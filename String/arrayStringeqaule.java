package String;

public class arrayStringeqaule {

	public static boolean arraystringequals(String[] word1, String[] word2) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		s1.append(word1[0]);
		s2.append(word2[0]);
		for(int i=1; i<word1.length; i++) {
			s1.append(word1[i]);
		}
        for(int i=1; i<word2.length; i++)
        {
             s2.append(word2[i]);
        }
        String Str1= s1.toString();
        String Str2= s2.toString();
		if(Str1.equals(Str2))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String[] str1= {"ab", "c"};
		String[] str2= {"a","bc"};
		boolean a=arraystringequals(str1, str2);
		System.out.println(a);
	}

}
