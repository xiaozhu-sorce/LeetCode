package Array;

public class T0219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j;
        for(i = 0;i < nums.length - 1;i++){
            for(j = i+1; j < i+1+k && j < nums.length;j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }

        return false;
    }
}
