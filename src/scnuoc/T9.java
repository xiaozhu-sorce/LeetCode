package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-13 22:12
 **/
public class T9 {
    //回溯法，运行时间超时。
    static int maxValue;

    public static int bag(int N, int c, int[] weight, int[] value) {
        if (N < 0) return 0;
        if (c < 0) return 0;
        for (int i = 0; i < N; i++) {
            if (c - weight[i] < 0) continue;
            maxValue = 0;
            maxValue = Math.max(maxValue, Math.max(bag(N - 1, c - weight[i], weight, value) + value[i], bag(N - 1, c - weight[i], weight, value)));
        }
        return maxValue;
    }

    //dp   dp[i][j]表示前i个物品，背包容量为j的情况下可以获得的最大价值的物品。
    public static long dp(int N, int c, int[] weight, int[] value) {
        long[][] dp = new long[N + 1][c + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < c + 1; j++) {
                if (j - weight[i] < 0) {
                    dp[i][j] = dp[i - 1][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
            }
        }

        return dp[N][c];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = sc.nextInt();

        int[] weight = new int[N + 1];
        for (int j = 1; j <= N; ) {
            weight[j++] = sc.nextInt();
        }

        int[] value = new int[N + 1];
        for (int j = 1; j <= N; ) {
            value[j++] = sc.nextInt();
        }

        System.out.print(dp(N, c, weight, value));
    }
}
