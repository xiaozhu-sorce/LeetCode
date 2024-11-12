package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-15 21:32
 **/
public class T19 {
    public static int backtrack(int[] nums, int i, int remain) {
        if (i == nums.length) {
            if (remain == 0) return 1;
            return 0;
        }
        return backtrack(nums, i + 1, remain - nums[i]) + backtrack(nums, i + 1, remain + nums[i]);
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, 0, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int target = scanner.nextInt();

        String[] str = s.split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        System.out.print(findTargetSumWays(a, target));
    }
}
