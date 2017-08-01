package dp;

import java.util.Scanner;

public class Ã”¿Î≈©≥° {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        final int MOD = 1000000007;

        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(k, i); j >= 1; j--) {
                for (int l = 0; l < n; l++) {
                    dp[j][l] = (dp[j][l] + dp[j - 1][(l + n - (i - 1)) % n]) % MOD;
                }
            }
        }

        System.out.println(dp[k][0]);
    }
}
