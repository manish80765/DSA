//Package Name
package Array;


//imported Packages
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Main class
public class findOriginalArray {
public static int[] findOriginalArray(int[] changed) {
	if (changed.length % 2 != 0) return new int[] {}; // must be even length

    Arrays.sort(changed);
    Map<Integer, Integer> freq = new HashMap<>();
    List<Integer> result = new ArrayList<>();

    // Count frequency of each number
    for (int num : changed) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    // Process in sorted order
    for (int num : changed) {
        if (freq.get(num) == 0) continue; // already used

        int twice = num * 2;

        // Special case for zero: need pairs of zeros
        if (num == 0) {
            if (freq.get(num) < 2) return new int[] {}; 
            freq.put(num, freq.get(num) - 2);
            result.add(num);
        } else {
            if (!freq.containsKey(twice) || freq.get(twice) == 0) {
                return new int[] {}; // can't pair
            }
            freq.put(num, freq.get(num) - 1);
            freq.put(twice, freq.get(twice) - 1);
            result.add(num);
        }
    }

    // Convert list to array
    return result.stream().mapToInt(Integer::intValue).toArray();     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x: findOriginalArray(new int[] {1,3,4,2,6,8}))
		{
			System.out.println(x);
		}

	}

}
