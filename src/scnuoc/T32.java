package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 19:38
 **/
public class T32 {
    public static int jump(int[] nums) {
        int far = 0;
        int end = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            far = Math.max(far, i + nums[i]);
            if (end == i) {
                jumps++;
                end = far;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for (int j = 0; j < len; ) {
            a[j++] = sc.nextInt();
        }

        System.out.print(jump(a));
    }
}
