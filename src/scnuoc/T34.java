package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 20:04
 **/
public class T34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for (int j = 0; j < len; ) {
            a[j++] = sc.nextInt();
        }

        int max = Math.max(a[0], a[1]);

        for (int i = 0; i < len; i++) {
            if (a[i] != max) {
                System.out.print(i+1);
                break;
            }
        }
    }
}
