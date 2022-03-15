package Array;

public class T0026_RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while(fast < nums.length){
            if(nums[fast] == nums[slow]){
                fast++;
                continue;
            }
            nums[++slow] = nums[fast];

        }
        return slow+1;
    }
}
