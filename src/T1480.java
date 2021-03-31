public class T1480 {
    public int[] runningSum(int[] nums) {
        int[] num;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}