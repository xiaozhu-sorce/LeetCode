package Backtracking;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-16 20:30
 **/
public class T0343_IntegerBreak {
    int max = 1;

    //F(i)分割i可以的到的乘积最大值。
    public void BackTracking(int n, int start, int mul) {
        if (n <= 1 || start > n) {
            max = Math.max(max, mul);
        }

        //减枝
        for (int i = start; i <= n; i++) {
            mul *= i;
            BackTracking(n - i, i, mul);
            mul /= i;
        }
    }

    public int integerBreak(int n) {
        if (n == 2 || n == 3) {
            return n - 1;
        }
        BackTracking(n, 1, 1);
        return max;
    }

    public int integerBreak2(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        // dp[3] = 2;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++)
                dp[i] = Math.max(j * (i - j), j * dp[i - j]);
        }
        return dp[n];
    }

}
