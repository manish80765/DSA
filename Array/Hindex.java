package Array;

import java.util.Arrays;

public class Hindex {

	 public static int hIndex(int[] citations) {
		 Arrays.sort(citations);
	        int n = citations.length;
	        int h = 0;

	        for (int i = 0; i < n; i++) {
	            int papersWithAtLeastThisCitations = n - i;
	            if (citations[i] >= papersWithAtLeastThisCitations) {
	                h = papersWithAtLeastThisCitations;
	                break;
	            }
	        }
	        return h;	        
	    }
	public static void main(String[] args) {
System.out.println(hIndex(new int[] {3,0,6,1,5}));
	}

}
