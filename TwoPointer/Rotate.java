package TwoPointer;

public class Rotate {

public static void rotate(int[] nums, int k) {
	
        int n=nums.length;
     //   if(n<k) return;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums, k, n-1);
        int []arr=reverse(nums, 0, k-1);
        for(int x:arr )
        {
        	System.out.print(x);
        }
             
}
static int[] reverse(int[]nums ,int left,int right )
{
	while(left<right)
	{ 
		int temp=nums[left];
		nums[left]=nums[right];
		nums[right]=temp;
		left++;
		right--;
	}
	
	return nums;	
}
	public static void main(String[] args) {
		rotate(new int[]{1,2,3,4,5,6,7}, 3);
	}

}
