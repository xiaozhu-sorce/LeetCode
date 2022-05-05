package SlidingWindow;

public class T0713_SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int num = 0;
        int len = nums.length;
        int product = 1;
        int i, j;
        if(k <= 1)
            return 0;

        for (i = 0, j = 0; j < len; j++) {
            product *= nums[j];
            while(product >= k){
                product /= nums[i];
                i++;
            }
            num += (j - i + 1);
        }

        return num;
    }
}
