package scnuoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-13 22:10
 **/
public class T12 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int num = 0;
        int k = 0;

        for (int i = 0; i < g.length; i++) {
            int j = k;
            for (; j < s.length; j++) {
                if (g[i] <= s[j]){
                    num++;
                    k = ++j;
                    break;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String g = scanner.nextLine();
        String s = scanner.nextLine();

        String[] str1 = g.split(" ");
        String[] str2 = s.split(" ");
        int[] a = new int[str1.length];
        int[] b = new int[str2.length];
        for (int i = 0; i < str1.length; i++) {
            a[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < str2.length; i++) {
            b[i] = Integer.parseInt(str2[i]);
        }
        System.out.print(findContentChildren(a,b));
    }
}
