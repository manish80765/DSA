package Array;

import java.util.Arrays;

public class largestPerimeter {
	 public static int largestPerimeter(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=nums.length-3; i>=0;i--)
	        {
	        	if(nums[i]+nums[i+1]>nums[i+2])
	        	{
	        		return nums[i+1]+nums[i+2]+nums[i];
	        		 
	        	}
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(largestPerimeter(new int[] {1,2,1,10}));

	}

}
