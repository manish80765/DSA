package Array;

import java.util.ArrayList;

public class sumEvenAfterQueries {
	public static int evensum(int[] arr)
	{
	int sum=0;
	for(int x:arr)
	{
		if(x%2==0)sum=sum+x;
		
	}
	return sum;
	}

public static  int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
	ArrayList<Integer> result=new ArrayList<Integer>();
	for(int i=0; i<queries.length; i++)
	{
		nums[queries[i][1]]=nums[queries[i][1]]+queries[i][0];
		result.add(evensum(nums));
	}
	return result.stream().mapToInt(Integer::intValue).toArray();      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumEvenAfterQueries(new int[] {1,2,3,4}, new int[][] {{1,0},{-3,1},{-4,0},{2,3}});

	}

}
