package SlidingWindow;

public class longestOnes {
	  public static int longestOnes(int[] nums, int k) {
	         int left = 0, right = 0;
	        int maxLength = 0;
	        int zerosCount = 0;

	        while (right < nums.length) {
	            // If we encounter a 0, increase the zero count
	            if (nums[right] == 0) {
	                zerosCount++;
	            }

	            // If zeros are more than k, shrink the window from the left
	            while (zerosCount > k) {
	                if (nums[left] == 0) {
	                    zerosCount--;
	                }
	                left++;
	            }

	            // Update the maximum length of the window
	            maxLength = Math.max(maxLength, right - left + 1);

	            // Move the right pointer forward
	            right++;
	        }

	        return maxLength;
	    }
	public static void main(String[] args) {
		int[] arr= {1,1,1,0,0,0,1,1,1,1,0};
		
System.out.println(longestOnes(arr, 2));
	}

}
