package Backtracking;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-15 21:33
 **/
public class T0494_Target_Sum {
    public int backtrack(int[] nums, int i, int remain) {
        if (i == nums.length) {
            if (remain == 0) return 1;
            return 0;
        }
        return backtrack(nums, i + 1, remain - nums[i]) + backtrack(nums, i + 1, remain + nums[i]);
    }

    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, 0, target);
    }
}
