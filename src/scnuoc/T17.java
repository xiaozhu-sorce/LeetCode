package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-15 16:51
 **/
public class T17 {
    static int res = 0;

    public static int subsetXORSum(int[] nums) {
        backtrack(nums,0,0);
        return res;
    }

    public static void backtrack(int[] nums, int start,int xor_sum) {
        if (start == nums.length) {
            xor_sum = 0;
        }

        for (int j = start; j < nums.length; j++) {
            res += xor_sum ^ nums[j];
            xor_sum ^= nums[j];
            backtrack(nums,j+1,xor_sum);
            xor_sum ^= nums[j];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] str = s.split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        System.out.print(subsetXORSum(a));
    }
}
