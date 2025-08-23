package prefix;

public class largestAltitude {
	 public static int largestAltitude(int[] gain) {
		 int n=gain.length;
		 int current=0;
		 int max=0; 
		 for(int i=0; i<n; i++)
		 {
			 current=current+gain[i];
			 max=Math.max(max, current);
		 }
		return max;        
	    }
	public static void main(String[] args) {
		int[] arr1= {-5,1,5,0,-7};
		System.out.println(largestAltitude(arr1));

	}

}
