package Array;

public class Offer_0053_LCOF {
    public int search(int[] nums, int target) {
        int num = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                num ++;
            }
        }
        return num;
    }
}