package scnuoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-11 19:57
 **/
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[len];
        for (int j = 0; j < len; ) {
            arr[j++] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = len; i > 0; i--) {
            if (i == len - k)
                System.out.print(arr[i]);
        }
    }
}
