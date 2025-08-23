package test;

public class Problem1 {
    public int solve(int A, int[] B, int C) {
        int left = 1, right = A, answer = A;

        while (left <= right) {
            int mid = (left + right) / 2;
            int th = A - mid + 1;

            // Convert B to an array of 1s and -1s based on threshold
            int[] m = new int[A];
            for (int i = 0; i < A; i++) {
                if (B[i] >= th) {
                    m[i] = 1;
                } else {
                    m[i] = -1;
                }
            }

            if (hasValidSubarray(m, C)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private boolean hasValidSubarray(int[] m, int C) {
        int n = m.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + m[i];
        }

        int mPrefix = 0;
        for (int i = C; i <= n; i++) {
            mPrefix = Math.min(mPrefix, prefix[i - C]);
            if (prefix[i] - mPrefix > 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
    	
    }
}
