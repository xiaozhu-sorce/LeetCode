package Array;

import java.util.Arrays;

public class T1913_MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}