package scnuoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 19:55
 **/
public class T33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for (int j = 0; j < len; ) {
            a[j++] = sc.nextInt();
        }
        Arrays.sort(a);

        System.out.print("[");
        for (int i = 0;i < len;i++){
            System.out.print(a[i]);
            if (i != len -1 )
                System.out.print(",");
        }
        System.out.print("]");
    }
}
