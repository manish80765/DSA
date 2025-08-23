package Array;

import java.util.*;

;

public class WordBreak {
	   public static boolean wordBreak(String s, List<String> wordDict) {
		  /* boolean e=false;
		   int a=wordDict.size();
		   StringBuilder St= new StringBuilder();
		   for(int i=0; i<a; i++)
		   {
			  St.append(wordDict.get(i));
		   }
		   String w=St.toString();
		   if(s.contains(w))
			 {
				 return true;
			 }
		   else if(w.contains(s))
		   {
			   return true;
		   }
			 else{
				 return false;
			 }*/
		   Set<String> wordSet = new HashSet<>(wordDict);
	        boolean[] dp = new boolean[s.length() + 1];
	        dp[0] = true;

	        for (int i = 1; i <= s.length(); i++) {
	            for (int j = 0; j < i; j++) {
	                if (dp[j] && wordSet.contains(s.substring(j, i))) {
	                    dp[i] = true;
	                    break;
	                }
	            }
	        }

	        return dp[s.length()];
	    }
	   public static void main(String[] args)
	   {
		   List<String> wordDict= new ArrayList<>();
		   wordDict.add("a");
		   wordDict.add("b");
		   wordDict.add("bbb");
		   wordDict.add("bbbb");
		   String s="bb";
		   boolean a=wordBreak(s,wordDict);
		   System.out.println(a);
	   }
}
