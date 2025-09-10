package Array;

public class pivotIndex {
	public static int sum(int i, int j, int[] arr)
	{
		int sum=0;
		for(int a =i; a<j; a++)
		{
			sum=sum+arr[a];
		}
		return sum;
	}
	 public static int pivotIndex(int[] nums) {
		 int i=0;
	        for( i=0; i<nums.length; i++)
	        {
	        	if(sum(0,i,nums)==sum(i+1,nums.length,nums))
	        	{
	        		return i;
	        	}
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(pivotIndex(new int[] {2,1,-1}));

	}

}
