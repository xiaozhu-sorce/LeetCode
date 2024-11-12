package DynamicProgramming;

import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-24 18:57
 **/
public class T0698_PartitiontoKEqualSumSubsets {
    public boolean backtrack(int[] nums, int k, int[] bucket, int target, int index) {
        if (index == -1) {
            return true;
        }

        for (int j = 0; j < k; j++) {
            if (j > 0 && bucket[j] == bucket[j - 1]) continue;
            if (bucket[j] + nums[index]> target) continue;
            bucket[j] += nums[index];
            if(backtrack(nums, k, bucket, target, index - 1))   return true;
            bucket[j] -= nums[index];
        }
        return false;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int target = 0;
        for (int n : nums) target += n;
        if (target % k == 0) target /= k;
        else return false;
        Arrays.sort(nums);

        int[] bucket = new int[k];

        return backtrack(nums, k, bucket,target,nums.length-1);
    }
}
