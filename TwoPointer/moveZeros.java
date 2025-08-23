package TwoPointer;

import java.util.Arrays;

public class moveZeros {
	 public static void moveZeroes(int[] nums) {
		 int i=0,j=0,temp;
		 for(i=0;i<nums.length;i++)
		    {
		        if(nums[i]!=0 && nums[j]==0)
		            {
		             temp=nums[i];
		             nums[i]=nums[j];
		             nums[j]=temp;
		            }
		        if(nums[j]!=0)
		            j+=1;
		    }
	      System.out.println(Arrays.toString(nums));
	    }
	public static void main(String[] args) {
		int[] arr= {0,1,0,3,12};
		moveZeroes(arr);	}

}
