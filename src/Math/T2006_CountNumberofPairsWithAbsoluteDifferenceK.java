package Math;

public class T2006_CountNumberofPairsWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) ans++;
            }
        }
        return ans;
    }
}
