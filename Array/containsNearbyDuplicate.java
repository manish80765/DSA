package Array;

import java.util.HashMap;
import java.util.Map;

public class containsNearbyDuplicate {

public static boolean containsNearbyDuplicate(int[] nums, int k) {
	int n= nums.length;
	Map<Integer,Integer> map =new HashMap<Integer, Integer>();
	for(int i=0; i<nums.length; i++)
	{
		if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
		{
			return true;
		}
		else
		{
			map.put(nums[i], i);
		}
	}
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3},2));
	}

}
