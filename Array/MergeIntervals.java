package Array;
import java.util.Arrays;
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));//used to sort 2d array
        int[][] merged = new int[intervals.length][2];
        int c = 0;
        merged[c] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (merged[c][1] >= intervals[i][0]) {
                merged[c][1] = Math.max(merged[c][1]/*used to get max of two no*/, intervals[i][1]);
            } else {
                c++;
                merged[c] = intervals[i];
            }
        }
        return Arrays.copyOf(merged, c + 1);
    }
    public static void main(String[] args) {
        int[][] a = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] c = merge(a);
        for (int[] interval : c) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

