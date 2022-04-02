package Contest.biweekly_contest_75;

public class T6034_FindTriangularSumofanArray {
    public int triangularSum(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int[] newSum = new int[nums.length-1];
        for(int i = 0;i < newSum.length;i++){
            newSum[i] = (nums[i] + nums[i+1]) % 10;
        }
        return triangularSum(newSum);
    }
}
