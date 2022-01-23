package Array;

public class T5991_RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] nums) {
        int[] num = new int[nums.length];
        int f = 0;
        int s = 1;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] > 0){
                num[f] = nums[i];
                f+=2;
            }
            else {
                num[s] = nums[i];
                s+=2;
            }
        }
        return num;
    }
}
