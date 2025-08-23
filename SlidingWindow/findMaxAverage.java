package SlidingWindow;

import java.util.Arrays;

public class findMaxAverage {
public static double findMaxAverage(int[] nums, int k) {
	/*int n=nums.length;
	if(n==1)
	{
		return nums[0]/(double)k;
	}
	int max=0;
	for(int i=0; i<=n-k; i++)
	{
		 int currentSum = sum(nums, i, i + k - 1);  // inclusive range
	        if (max <= currentSum) {
	            max = currentSum;
	        }
	        System.out.println(max);
	}
	System.out.println(max);
	return (double)max/(double)k;   
	*/
	 int n = nums.length;
     double sum = 0;
     for (int i = 0; i < k; i++) {
         sum += nums[i];
     }

     double maxSum = sum;
     for (int i = k; i < n; i++) {
         sum = sum - nums[i - k] + nums[i];
         maxSum = Math.max(maxSum, sum);
     }
     return maxSum / k;
    }
/*static int sum(int[] arr,int i,int k)
{
	int sum=0;
	for(int j=i; j<=k; j++)
	{
		sum=sum+arr[j];
	}
	return sum;
}*/	
	public static void main(String[] args) {
		int[] arr={-1};
		double a=findMaxAverage(arr,1);
		System.out.println(a);
	}

}
