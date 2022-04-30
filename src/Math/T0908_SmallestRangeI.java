package Math;

public class T0908_SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];

        for (int i : nums) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        return Math.max(0, max - min - 2 * k);
    }
}
