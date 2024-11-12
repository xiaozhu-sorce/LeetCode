package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-11 18:14
 **/
public class T14 {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int contains = 0;

        while (left < right) {
            int cur = Math.min(height[left], height[right]) * (right - left);
            contains = Math.max(contains, cur);
            if (height[left] < height[right])
                left++;
            else
                right--;

        }
        return contains;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] str = s.split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        System.out.println(maxArea(a));
    }
}
