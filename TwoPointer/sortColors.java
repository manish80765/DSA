package TwoPointer;

import java.util.Arrays;

public class sortColors {

   public static void sortColors(int[] nums) {
      
	   
	   
	   Arrays.sort(nums);
        for(int x:nums)
        {
        	System.out.print(x);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortColors(new int[] {2,0,2,1,1,0});

	}

}
