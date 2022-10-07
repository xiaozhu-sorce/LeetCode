package Array;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-07 17:51
 **/
public class T1800_MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        int num = 0;
        int n = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            num = nums[i];
            while (i + 1 < len && nums[i + 1] > nums[i]) {
                num += nums[i + 1];
                i++;
            }

            if (num > n) n = num;
        }
        return n;
    }
}
