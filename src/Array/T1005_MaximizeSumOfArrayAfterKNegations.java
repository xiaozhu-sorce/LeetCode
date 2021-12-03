package Array;

import java.util.Arrays;

public class T1005_MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int j = 0;
        for(int i = 0; i < nums.length && nums[i] <= 0;i++){
            if(i < k){
                nums[i] = -nums[i];
                j++;
            }
        }
        k-=j;
        Arrays.sort(nums);
        if(k % 2 == 1) nums[0] = -nums[0];

        for(int i = 0 ; i < nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}
