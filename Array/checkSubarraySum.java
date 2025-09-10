package Array;

import java.util.HashMap;
import java.util.Map;

public class checkSubarraySum {

public static boolean checkSubarraySum(int[] nums, int k) {
	Map<Integer, Integer> map= new HashMap<Integer, Integer>();
	map.put(0, -1);
	int sum=0;
	for(int i=0; i<nums.length; i++)
	{
	
		sum+=nums[i];
		if(map.containsKey(sum%k))
		{
			if(i-map.get(sum%k)>=2)
			return true;
		}
		else {
			map.put(sum%k, i);
		}
	}
	
        return false;
    }
	public static void main(String[] args) {
		System.out.println(checkSubarraySum(new int[] {1,2,12}, 6));

	}

}
