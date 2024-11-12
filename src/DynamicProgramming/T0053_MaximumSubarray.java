package DynamicProgramming;

import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-10 23:51
 **/
public class T0053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0)
                nums[i] += nums[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        return max;
    }
}
