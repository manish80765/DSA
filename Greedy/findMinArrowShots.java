package Greedy;

import java.util.Arrays;

public class findMinArrowShots {

	public static int findMinArrowShots(int[][] points) {
	    if (points.length == 0) return 0;
	    Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

	    int c = 1;
	    int[] pre = points[0];
	    for (int i = 1; i < points.length; i++) {
	        int cs = points[i][0];
	        int ce = points[i][1];
	        int ps = pre[0];
	        int pe = pre[1];

	        if (cs > pe) {
	            // new arrow needed
	            c++;
	            pre = points[i];
	        } else {
	            // overlap: update intersection
	            pre[0] = Math.max(ps, cs);
	            pre[1] = Math.min(pe, ce);
	        }
	    }
	    return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findMinArrowShots(new int[][] {{10,16},{2,8},{1,6},{7,12}}));
	}

}
