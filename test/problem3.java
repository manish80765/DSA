package test;
import java.util.*;
public class problem3 {
    static final int MOD = 1_000_000_007;
    public static long solve(int A, int B, int C) {
        long[][] transition = new long[B][B];
        for (int i = 0; i < B; i++) {
            transition[0][i] = (transition[0][i] + (C - 1)) % MOD;
            if (i + 1 < B) {
                transition[i + 1][i] = 1;
            }
        }
        long[] dp = new long[B];
        dp[0] = C;
        long[][] T = matrixPower(transition, A - 1);
        long result = 0;
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < B; j++) {
                result = (result + T[i][j] * dp[j]) % MOD;
            }
        }
        return result;
    }
    private static long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }
    private static long[][] matrixPower(long[][] base, long exp) {
        int size = base.length;
        long[][] result = new long[size][size];

        // Identity matrix
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = multiply(result, base);
            }
            base = multiply(base, base);
            exp >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(solve(3, 1, 3));
        System.out.println(solve(3, 3, 2)); 
    }
}
