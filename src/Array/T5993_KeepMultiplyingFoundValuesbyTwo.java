package Array;

import java.util.Arrays;

public class T5993_KeepMultiplyingFoundValuesbyTwo {
    public int findFinalValue(int[] nums, int original) {
        int len = original;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] == original){
                len += original;
                original = 2 * original;
            }
        }
        return len;
    }
}
