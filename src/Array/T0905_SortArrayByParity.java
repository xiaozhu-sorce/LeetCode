package Array;

public class T0905_SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int slow = 0,fast = 0;
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(nums[i] % 2 != 0){
                fast = i;
                break;
            }
        }
        for(slow = fast;slow < n; slow++){
            if(nums[slow]%2 != 0){
                while(fast < n){
                    if(nums[fast] % 2 == 0){
                        swap(nums,slow,fast);
                        break;
                    }
                    fast++;
                }
            }
        }
        return nums;
    }

    public void swap(int[] nums,int slow,int fast){
        int temp = nums[fast];
        nums[fast] = nums[slow];
        nums[slow] = temp;

    }
}
