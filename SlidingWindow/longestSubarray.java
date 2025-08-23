package SlidingWindow;

public class longestSubarray {
public static int longestSubarray(int[] nums) {
	 int left = 0, right = 0;
     int zeroCount = 0;
     int maxLength = 0;
     while (right < nums.length) {
         if (nums[right] == 0) {
             zeroCount++;
         }

         while (zeroCount > 1) {
             if (nums[left] == 0) {
                 zeroCount--;
             }
             left++;
         }
         maxLength = Math.max(maxLength, right - left);
         right++;
     }

     return maxLength;
    }
	public static void main(String[] args) {
		int [] arr= {0,1,1,1,0,1,1,0,1};
		System.out.println(longestSubarray(arr));
	}

}
