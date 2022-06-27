package Array;

import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description: 522. Longest Uncommon Subsequence II
 * @author: XiaoZhu
 * @create: 2022-06-27 08:51
 **/
public class T0522_LongestUncommonSubsequenceII {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, (a, b) -> b.length() - a.length());
        for (int i = 0; i < strs.length; i++) {
            if (!isSubSeqOfAnother(strs, i)) {
                return strs[i].length();
            }
        }
        return -1;
    }

    boolean isSubSeqOfAnother(String strs[], int idx) {
        for (int i = 0; i < strs.length; i++) {
            if (i == idx) {
                continue;
            }
            if (strs[i].length() < strs[idx].length()) {
                break;
            }
            if (isSubSeq(strs[idx], strs[i])) {
                return true;
            }
        }
        return false;
    }

    boolean isSubSeq(String s1, String s2) {
        int p1 = 0, p2 = 0;
        while (p1 < s1.length() && p2 < s2.length()) {
            while (p2 < s2.length() && s2.charAt(p2) != s1.charAt(p1)) {
                p2++;
            }
            if (p2 < s2.length()) {
                p1++;
            }
            p2++;
        }
        return p1 == s1.length();
    }
}
