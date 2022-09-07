package Array;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-09-06 17:35
 **/
public class T2395_FindSubarraysWithEqualSum {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        int[] num = new int[n - 1];

        for (int i = 0; i < n - 2; i++) {
            num[i] = nums[i] + nums[i + 1];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
