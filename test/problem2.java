package test;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem2 {
    private static final int MOD = 1000000007;

    public int[] findProbabilities(int[][] A) {
        int q = A.length;
        int[] results = new int[q];

        for (int i = 0; i < q; i++) {
            int l = A[i][0];
            int r = A[i][1];
            int n = r - l + 1;

            // Set to store unique midpoints
            Set<Integer> midpoints = new HashSet<>();

            // Generate midpoints
            for (int j = l; j <= r; j++) {
                midpoints.add(j);
            }

            // Count of unique midpoints
            int m = midpoints.size();

            // Calculate P and Q
            long P = (n - m + MOD) % MOD; // Count of numbers that are not midpoints
            long Q = n; // Total count of numbers

            // Handle case where P is zero
            if (P == 0) {
                results[i] = 0; // Probability is zero if no failures
                continue;
            }

            // Calculate Q^-1 using Fermat's Little Theorem
            long Q_inv = modInverse(Q, MOD);

            // Result for this query
            results[i] = (int) ((P * Q_inv) % MOD);
        }

        return results;
    }

    private long modInverse(long a, long mod) {
        return power(a, mod - 2, mod);
    }

    private long power(long x, long y, long p) {
        long res = 1; // Initialize result
        x = x % p; // Update x if it is more than or equal to p
        while (y > 0) {
            // If y is odd, multiply x with result
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            // y must be even now
            y = y >> 1; // y = y / 2
            x = (x * x) % p; // Change x to x^2
        }
        return res;
    }

    public static void main(String[] args) {
        problem2 sol = new problem2();
        
        // Example input
        int[][] A1 = {{2, 9}};
        int[] result1 = sol.findProbabilities(A1);
        System.out.println(Arrays.toString(result1)); // Expected Output: [500000004]

        int[][] A2 = {{10, 10}, {10, 12}};
        int[] result2 = sol.findProbabilities(A2);
        System.out.println(Arrays.toString(result2)); // Expected Output: [1, 666666672]
    }
}
