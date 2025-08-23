package test;

public class problem4 {
	public int solution(int[] arr, int[][] mat) {
	    int n = arr.length;
	    int totalUpdates = 0;

	    for (int[] query : mat) {
	        int X = query[0] - 1; 
	        int Y = query[1];
	        int Z = query[2];

	        int bitMask = 1 << (Y - 1);
	        int end = X;
	 
	        while (end < n && (arr[end] & bitMask) != 0) {
	            end++;
	        }

	        int length = end - X;
	        if (length > 0) {
	            totalUpdates += length;
	           
	            for (int i = X; i < end; i++) {
	                arr[i] ^= Z;
	            }
	        }
	    }

	    return totalUpdates;
	}
}
