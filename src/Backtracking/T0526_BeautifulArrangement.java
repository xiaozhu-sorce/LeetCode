package Backtracking;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-16 10:44
 **/
public class T0526_BeautifulArrangement {
    int res = 0;
    boolean[] flag;

    public int backtrack(int n, int s) {
        if (s == n + 1)
            res++;

        for (int i = 1; i < n + 1; i++) {
            if (flag[i])
                continue;
            if (s % i == 0 || i % s == 0) {
                flag[i] = true;
                backtrack(n, i + 1);
                flag[i] = false;
            }
        }
        return res;
    }

    public int countArrangement(int n) {
        flag = new boolean[n + 1];
        backtrack(n, 1);
        return res;
    }
}
