package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxWalls {

public static int maxWalls(int[] robots, int[] distance, int[] walls) {
	
	 int n = robots.length;
     int m = walls.length;

     int[][] robotInfo = new int[n][2];
     for (int i = 0; i < n; i++) {
         robotInfo[i][0] = robots[i];
         robotInfo[i][1] = distance[i];
     }

     Arrays.sort(robotInfo, Comparator.comparingInt(a -> a[0]));
     Arrays.sort(walls);

     int[] leftLimit = new int[n];
     int[] rightLimit = new int[n];
     Arrays.fill(leftLimit, Integer.MIN_VALUE);
     Arrays.fill(rightLimit, Integer.MAX_VALUE);

     for (int i = 1; i < n; i++) {
         leftLimit[i] = robotInfo[i - 1][0];
     }
     for (int i = 0; i < n - 1; i++) {
         rightLimit[i] = robotInfo[i + 1][0];
     }

     // Compute effective intervals
     List<int[]> intervals = new ArrayList();
     for (int i = 0; i < n; i++) {
         int pos = robotInfo[i][0];
         int d = robotInfo[i][1];

         // Left interval
         int leftBound = Math.max(pos - d, leftLimit[i] + 1);
         int rightBound = pos;
         if (leftBound <= rightBound) {
             intervals.add(new int[]{leftBound, rightBound});
         }

         // Right interval
         leftBound = pos;
         rightBound = Math.min(pos + d, rightLimit[i] - 1);
         if (leftBound <= rightBound) {
             intervals.add(new int[]{leftBound, rightBound});
         }
     }

     // Merge walls into coverage check
     int count = 0;
     int idx = 0;
     for (int w : walls) {
         while (idx < intervals.size() && intervals.get(idx)[1] < w) {
             idx++;
         }
         // check if wall w lies inside any interval
         for (int j = idx; j < intervals.size(); j++) {
             int[] in = intervals.get(j);
             if (in[0] <= w && w <= in[1]) {
                 count++;
                 break;
             }
             if (in[0] > w) break; // since intervals are not sorted yet
         }
     }

     return count;
        
    }
	public static void main(String[] args) {
		System.out.println(maxWalls(new int[]{4}, new int[]{3}, new int[]{1, 10}));
	}

}
