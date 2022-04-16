package Contest.biweekly_contest_76;

public class T6060_FindClosestNumbertoZero {
    public int findClosestNumber(int[] nums) {
        int i;
        int res = Integer.MAX_VALUE;
        for (i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]);
            if (a < Math.abs(res))
                res = nums[i];
            else if (a == Math.abs(res) && nums[i] > res)
                res = nums[i];
        }
        return res;
    }
}