package SlidingWindow;

import java.util.Set;

public class maxVowels {
public static int maxVowels(String s, int k) {
	int maxCount = 0, count = 0;
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
    
    for (int i = 0; i < s.length(); i++) {
        if (vowels.contains(s.charAt(i))) {
            count++;
        }
        if (i >= k && vowels.contains(s.charAt(i - k))) {
            count--;
        }
        maxCount = Math.max(maxCount, count);
    }
    return maxCount;    
    }

	public static void main(String[] args) {
		System.out.println(maxVowels( "abciiidef",3));
	}

}
