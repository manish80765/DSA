package String;

public class mergeAlternately {
	public static String mergeAlternately(String a, String b)
	{
		StringBuilder s= new StringBuilder();
		int c= a.length()>b.length()?b.length():a.length();
		int i=0;
		while(i<c)
		{
			s.append(a.charAt(i));
			s.append(b.charAt(i));
			i++;
		}
		if(a.length()>b.length())
		{
			while(i<a.length())
			{
				s.append(a.charAt(i));
				i++;
			}
		}
		else
		{
			while(i<b.length())
			{
				s.append(b.charAt(i));
				i++;
			}
		}
		return s.toString();
	}
	public static void main(String[] args) {
		String a="abc";
		String b="p";
		System.out.println(mergeAlternately(a, b));
	}

}
