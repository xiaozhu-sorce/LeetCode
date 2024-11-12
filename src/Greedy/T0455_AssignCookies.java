package Greedy;

import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-13 22:20
 **/
public class T0455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
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
}
