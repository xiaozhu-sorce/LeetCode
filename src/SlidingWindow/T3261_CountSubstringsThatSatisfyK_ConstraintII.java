package SlidingWindow;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-11-12 11:10
 **/
public class T3261_CountSubstringsThatSatisfyK_ConstraintII {
    public static int countKConstraintSubstrings(String s, int k) {
        int left = 0, right = 0;
        int[] window = new int[2];
        int res = 0;
        while (right < s.length()) {
            int i = s.charAt(right) - '0';
            window[i]++;
            while (window[0] > k && window[1] > k) {
                int d = s.charAt(left) - '0';
                window[d]--;
                left++;
            }
            res+=right-left+1;
            right++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.print(countKConstraintSubstrings(s, k));
    }
}
