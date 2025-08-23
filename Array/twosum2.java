package Array;

public class twosum2 {
	 public static int[] twoSum(int[] numbers, int target) {
		 int left=0;
		 int right=numbers.length-1;    
		 while(left<right)
		 {
			 if(numbers[left]+numbers[right]>target)
			 {
				 right--;
			 }
			 if(numbers[left]+numbers[right]<target)
			 {
				 left--;
			 }
		 }
		 return new int [] {left,right};
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
