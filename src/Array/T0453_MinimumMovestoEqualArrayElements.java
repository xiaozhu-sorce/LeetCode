package Array;

public class T0453_MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int ope=0,min=nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        for(int i = 0;i<nums.length;i++){
            ope+=(nums[i]-min);
        }
        return ope;
    }
}
