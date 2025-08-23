package TwoPointer;

import java.util.Arrays;

public class reverseWords {
	public static String reverseWords(String s) {
		String[] st=s.split("\\s+");
		int  left=0;
		int right=st.length-1;
		String temp;
		while(left<right)
		{
			temp=st[left];
			st[left]=st[right];
			st[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(st));
		StringBuilder str= new StringBuilder();
		for(String x: st)
		{
			str.append(x);
			str.append(" ");
		}
		return str.toString().trim(); 
    }
	public static void main(String[] args) {
		String s="a good   example";
		System.out.println(reverseWords(s));
		
		}

}
