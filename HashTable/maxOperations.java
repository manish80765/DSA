package HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class maxOperations {
public static int maxOperations(int[] nums, int k) {
	HashMap<Integer, Integer> map = new HashMap<>();
    int operations = 0;

    for (int num : nums) {
        int complement = k - num;

        if (map.getOrDefault(complement, 0) > 0) {
            // A matching pair is found
            operations++;
            map.put(complement, map.get(complement) - 1);
        } else {
            // Store the current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    return operations;
	/*Arrays.sort(nums);
	int a=0;
	int left=0; 
	int right=nums.length-1;
	while(left<right)
	{
		if(nums[left]+nums[right]>k)
		{
			right--;
		}
		else if(nums[left]+nums[right]<k)
		{
			left++;
		}
		else
		{
			left++;
			right--;
			a++;
		}
	}
	return a;  */  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int a=5;
		System.out.println(maxOperations(arr,a));
	}

}
