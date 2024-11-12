package scnuoc;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    private static int manyNums(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for (int j = 0; j < len; ) {
            a[j++] = sc.nextInt();
        }
        System.out.print(manyNums(a));
    }
}
