package prefix;

public class pivotIndex {
	public int pivotIndex(int[] nums) {
		int left=0;
		int right=nums.length-1;
		int pivotindex=0;
		int lsum=0;
		int rsum=-0;
		while(left<right)
			if(lsum>rsum)
			{rsum=rsum+nums[right];
				
				right++;
			}
			else
			{
				lsum=lsum+nums[left];
				left++;
			}
		if(lsum==rsum)
		{
			return ++left;
		}
			
		
	return -1;       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
