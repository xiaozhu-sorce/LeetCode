package BinarySearch;

public class T0035_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        int left = 0,right = nums.length - 1;
        while(left <= right){
            int mid = (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}
