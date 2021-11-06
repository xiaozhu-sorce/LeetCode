package Array;

public class T0268_MissingNumber {
    public int missingNumber(int[] nums) {
        int i,j;
        for(i = 0;i<=nums.length;i++){
            for(j = 0; j<nums.length;j++){
                if(i == nums[j]){
                    break;
                }
            }
            if(j == nums.length){
                return i;
            }
        }
        return 0;
    }
}
