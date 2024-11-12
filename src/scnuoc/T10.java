package scnuoc;

import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-12 21:12
 **/
public class T10 {
    public static String longestPalindrome1(String s) {
        int len=s.length();
        int left=0,right=0,res=0; //记录左右边界和右-左的长度
        boolean[][] dp=new boolean[len][len];

        //这个两个for循环的精妙之处！！！dp数组走向问题。在二维图片中，每个位置[i,j]需要根据[i+1,j-1]的true和false来判断，在图中就是看斜下方的位置的数值。也就是从最右下方往上写dp
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){ //j=i这步就将每个单个字符dp赋为了true
                if(s.charAt(i)==s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])){//如果j - i <= 1，必是回文串
                    dp[i][j] = true;
                    if(j-i>res){
                        res=j-i;//res记得也得更新！
                        left=i;
                        right=j;
                    }
                }
            }
        }
        return s.substring(left,right+1);//左闭右开
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        char[] ch = s.toCharArray();
        //dp[i][j] 表示从i到j的子串是否为回文串
        boolean[][] dp = new boolean[len][len];
        String subStr = String.valueOf(ch[0]);

        if (len < 2) return s;

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
            if (i < len - 1 && ch[i] == ch[i + 1]) {
                dp[i][i + 1] = true;
                if (subStr.length() < 2) subStr = s.substring(i, i + 2);
            }
        }
        //奇数
        for (int i = 0; i < len; i++) {
            int k = i;
            for (int j = i; j < len; j++) {
                if (k - 1 < 0) break;
                if (j + 1 >= len) break;

                if (dp[k][j] && ch[k - 1] == ch[j + 1]) {
                    dp[k - 1][j + 1] = true;
                    if (j - k + 3 > subStr.length()) subStr = s.substring(k - 1, j + 2);
                }
                k--;

            }
        }
        //偶数，解决类似aaaa这样的问题。
        for (int i = 0; i < len; i++) {
            int k = i;
            for (int j = i + 1; j < len; j++) {
                if (k - 1 < 0) break;
                if (j + 1 >= len) break;

                if (dp[k][j] && ch[k - 1] == ch[j + 1]) {
                    dp[k - 1][j + 1] = true;
                    if (j - k + 3 > subStr.length()) subStr = s.substring(k - 1, j + 2);
                }
                k--;
            }
        }
        return subStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(longestPalindrome1(str));
    }
}
