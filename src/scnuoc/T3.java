package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-10 15:17
 **/
public class T3 {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0)
                nums[i] += nums[i - 1];
        }

        for (int num : nums) {
            if (max < num)
                max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for (int j = 0; j < len; ) {
            a[j++] = sc.nextInt();
        }

        System.out.println(maxSubArray(a));
    }
}
