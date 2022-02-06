package Math;

import java.util.Arrays;

public class T1748_SumofUniqueElements {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && nums[j] == nums[i]) j++;
            if (j - i == 1) ans += nums[i];
            i = j;
        }
        return ans;
    }
}
