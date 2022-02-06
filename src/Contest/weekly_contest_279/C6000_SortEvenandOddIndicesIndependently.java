package Contest.weekly_contest_279;

import java.util.Arrays;

public class C6000_SortEvenandOddIndicesIndependently {
    public int[] sortEvenOdd(int[] nums) {
        int[] a;
        if(nums.length % 2 != 0){
            a = new int[nums.length/2 + 1];
        }else{
            a = new int[nums.length/2];
        }
        int[] b = new int[nums.length/2];
        int j = 0,k = 0;

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                a[j++] = nums[i];
            }
            else{
                b[k++] = nums[i];
            }
        }
        j = 0;
        k = nums.length/2 - 1;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = a[j++];
            }
            else{
                nums[i] = b[k--];
            }
        }
        return nums;
    }
}
