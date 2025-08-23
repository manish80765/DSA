package Array;

import java.util.Arrays;

public class MajorityElement {
public static int majorityElement(int[] arr) {
	 int n = arr.length;
     if (n == 0) return 0;
     if (n == 1) return arr[0];

     boolean[] visited = new boolean[n];

     for (int i = 0; i < n; i++) {
         if (visited[i]) continue;

         int count = 1;
         visited[i] = true;

         for (int j = i + 1; j < n; j++) {
             if (arr[i] == arr[j]) {
                 count++;
                 visited[j] = true;
             }
         }

         if (count > n / 2) {
             return arr[i];
         }
     }

     return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,2,1,1,1,2,2};
         System.out.println(majorityElement(nums));
	}

}
