package Array;

public class T0540_SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l < r){
            int mid = (l+r)/2;
            if (nums[mid] == nums[mid ^ 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[r];
    }
}
