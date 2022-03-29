package Array;

public class T0303_RangeSumQuery_Immutable {
    int[] num;
    public T0303_RangeSumQuery_Immutable(int[] nums) {
        num = new int[nums.length+1];
        for(int i = 1;i < num.length;i++){
            num[i] = num[i-1] + nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return num[right+1] - num[left];
    }
}
