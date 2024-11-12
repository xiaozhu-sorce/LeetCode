package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-16 10:43
 **/
public class T21 {

    static int res = 0;
    static boolean[] flag;

    public static int backtrack(int n, int index) {
        if (index == n + 1){
            res++;
            return 0;
        }

        for (int i = 1; i < n + 1; i++) {
            if (flag[i])
                continue;
            if (index % i == 0 || i % index == 0) {
                flag[i] = true;
                backtrack(n, index + 1);
                flag[i] = false;
            }
        }
        return res;
    }

    public static int countArrangement(int n) {
        flag = new boolean[n + 1];
        backtrack(n,1);
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(countArrangement(n));
    }
}
