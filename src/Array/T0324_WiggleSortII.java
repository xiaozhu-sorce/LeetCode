package Array;

import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-06-28 08:39
 **/
public class T0324_WiggleSortII {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int mid = 0;
        if(nums.length%2 == 0)
            mid = nums.length/2-1;
        else
            mid = nums.length/2;

        int len = nums.length-1;

        int i = 0;
        while(i < nums.length){
            nums[i++] = arr[mid--];
            if (i == nums.length)   break;
            nums[i++] = arr[len--];
        }
    }
}
