package Array;

public class jump {

	 public static int jump(int[] nums) {
		/* if(nums.length<=1) return 0;
		 int n = nums.length;
		 int c=0;
		 for (int i = 0; i < n; i++) {
			 i=i+nums[i];
	            if(i<n)
	            {
	            	c++;
	            }
	        }*/
		 if (nums.length <= 1) return 0;
		    
		    int n = nums.length;
		    int i = 0, count = 0;

		    while (i < n) {
		        if (nums[i] == 0) break; // stuck
		        i = i + nums[i];
		        if (i < n) count++;
		    }

		    return count;
		        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jump(new int[] {2,1}));

	}

}
