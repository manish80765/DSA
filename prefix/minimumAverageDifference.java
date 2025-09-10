package prefix;

import java.util.Arrays;

public class minimumAverageDifference {
	  public static int minimumAverageDifference(int[] nums) {
		  int n = nums.length;
	        int c = -1;
	        long min = Long.MAX_VALUE;

	        long sum = Arrays.stream(nums).asLongStream().sum();
	        long ls = 0;

	        for (int i = 0; i < n; i++) {
	            ls += nums[i];
	            long rs = sum - ls;

	            int l = i + 1;
	            int r = n - l;

	            long leftAvg = ls / l;
	            long rightAvg = (r == 0) ? 0 : rs / r;

	            long diff = Math.abs(leftAvg - rightAvg);

	            if (diff < min) {
	                min = diff;
	                c = i;
	            }
	        }

	        return c;
	     /*   int n=nums.length;
	        int c=-1;
	        long min=Integer.MAX_VALUE;
	        long sum=Arrays.stream(nums).sum();
	        long ls=0;
	      
	        long rs=0;
	        for(int i=0; i<nums.length; i++)
	        {
	        	ls+=nums[i];
	            rs=sum-ls;
	        	int l=i+1;
	        	int r=nums.length-l;
	        	long leftavg=ls/l;
	        	long rightavg=(i==n-1)?0:rs/r;
	        	long diff=Math.abs(leftavg-rightavg);
	        	
	        	if(min>diff)
	        	{
	        		min=diff;
	        		c=i;
	        		
	        	}
	        }
	       
	        return c;*/
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(minimumAverageDifference(new int[] {2,5,3,9,5,3}));
	}

}
