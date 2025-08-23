package String;

public class StringCompression {
	public static int compress(char[] chars) {
		int n=chars.length;
        
        
        int i=0;
        int index=0;
        while(i<n)
        {
        	char current=chars[i];
        	int count=0;
        	while(i<n && chars[i]==current)
        	{
        		count++;
        		i++;
        	}
        	chars[index]=current;
        	index++;
        	if(count>1)
        	{
        		String str=Integer.toString(count);
        		 for(int j=0; j< str.length(); j++)
             	{
             		chars[index]=str.charAt(j);
             		index++;
             	}
        	}
        	
        	
        }
		return index;
        
    }
	public static void main(String[] args)
	{
		char[] chars= {'a','a','b','b','c','c','c'};
		System.out.println(compress(chars));
	}
}
