package DynamicProgramming;

import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-11 20:40
 **/
public class T0322_CoinChange {
    int[] memo;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -666);
        return dp(coins, amount);
    }

    private int dp(int[] coins, int amount) {
        if (amount < 0)
            return -1;
        if (amount == 0)
            return 0;
        if (memo[amount] != -666)
            return memo[amount];
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = dp(coins, amount - coin);
            if (subProblem == -1) continue;
            res = Math.min(res, subProblem + 1);
        }
        memo[amount] = (res == Integer.MAX_VALUE ? -1 : res);

        return memo[amount];
    }

    /* 动态规划
     * dp数组的含义：凑齐i元需要的最小硬币数量为m。即dp[i] = m
     * */
    public int coinChange1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        //从凑齐0元开始，自底向上算得计算amount元需要的最小硬币数量。
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0)
                    continue;
                dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
