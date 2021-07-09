public class T1710 {
    public int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i;j < nums.length;j++){
                if(nums[j] == nums[i]){
                    sum++;
                    if(sum > nums.length / 2 ){
                        return nums[i];
                    }
                }
            }
        }
        return -1;
    }
}
