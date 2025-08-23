package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
	  public static List<List<String>> groupAnagrams(String[] strs) {
		  // Map to store sorted string as key and list of anagrams as value
	        Map<String, List<String>> map = new HashMap();

	        for (String s : strs) {
	            // Convert the string to char array, sort it, and convert it back to string
	            char[] charArray = s.toCharArray();
	            Arrays.sort(charArray);
	            String sorted = new String(charArray);

	            // Add the original string to the corresponding sorted key
	            if (!map.containsKey(sorted)) {
	                map.put(sorted, new ArrayList<>());
	            }
	            map.get(sorted).add(s);
	        }

	        // Return all grouped anagrams
	        return new ArrayList<>(map.values());
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(s));
	}

}
