package contest;

import java.util.HashMap;
import java.util.Map;


public class partitionArray {

	 public static boolean partitionArray(int[] nums, int k) {
		
		 if (nums.length % k != 0) return false;
		 Map<Integer, Integer> map = new HashMap<>();
		    for (int num : nums) {
		        map.put(num, map.getOrDefault(num, 0) + 1);
		    }
		    for (int count : map.values()) {
		        if (count >nums.length/k) {
		            return false;
		        }
		    }
		    return true;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(partitionArray(new int[] {7,7,7,7,7,7,7}, 7));
	}

}
