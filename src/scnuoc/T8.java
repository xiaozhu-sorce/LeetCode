package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-12 20:29
 **/
public class T8 {
    public static int climbStairs(int n) {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int dp(int n) {
        int[] dp = new int[n + 1];

        if (n == 1)
            return 1;
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(dp(n));
    }
}
