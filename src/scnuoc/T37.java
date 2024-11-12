package scnuoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-13 16:17
 **/
public class T37 {
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, n + 1);
        int nums = (int) Math.sqrt(n) + 1;
        int[] squares = new int[nums];
        for (int i = 0; i < nums; i++) {
            squares[i] = (i+1) * (i+1);
        }
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 0; i < n+1; i++) {
            for (int square:squares){
                if (i-square < 0)
                    continue;
                dp[i] = Math.min(dp[i-square]+1,dp[i]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        System.out.print(numSquares(n));
    }
}
