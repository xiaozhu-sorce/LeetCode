package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T5989_CountElementsWithStrictlySmallerandGreaterElements {
    public int countElements(int[] nums) {
        if(nums.length <= 2)
            return 0;

        int n = 0;
        Arrays.sort(nums);

        for (int i = 0;i < nums.length;i++){
            if(nums[i] == nums[0] || nums[i] == nums[nums.length-1])
                n++;
        }

        return nums.length - n;
    }
}
