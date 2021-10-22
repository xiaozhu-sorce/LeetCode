package Dynamicprogramming;

public class T0746_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, curr = 0,r;
        for (int i = 2; i <= n; i++) {
            r = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = r;
        }
        return curr;
    }
}
