package String;

import java.util.ArrayList;
import java.util.List;
public class kidsWithCandies {
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 List<Boolean> list= new ArrayList<Boolean>();
		 int max=largest(candies);
		 
		 for(int x: candies)
		 {
			 if(x+extraCandies>=max)
			 {
				 list.add(true);
			 }
			 else
			 {
				 list.add(false);
			 }
		 }
		 
		return list;
	        
	    }
	public static int largest(int[] arr) 
	    {       
	        int max = arr[0]; 
	        for (int i = 1; i < arr.length; i++)
	            if (arr[i] > max)  
	                max = arr[i]; 
	        return max; 
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,5,1,3};
		int a=3;
		System.out.println(kidsWithCandies(arr,a));
		

	}

}
