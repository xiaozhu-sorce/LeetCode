package Greedy;

import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2023-02-04 17:15
 **/
public class T1798_MaximumNumberOfConsecutiveValuesYouCanMake {
    //TLE
    public int getMaximumConsecutive(int[] coins) {
        int num = 1;
        Arrays.sort(coins);
        while (true) {
            if (!isAdd(num, coins)) {
                break;
            }
            num++;
        }
        return num;
    }

    public boolean isAdd(int num, int[] cs) {
        boolean flag = false;
        for (int i = cs.length - 1; i >= 0; i--) {
            if (num < 0) {
                break;
            } else {
                while(cs[i] > num && i > 0)  i--;
                num -= cs[i];
                if (num == 0){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    //官方解法。
    public int getMaximumConsecutive2(int[] coins) {
        int res = 1;
        Arrays.sort(coins);
        for (int i : coins) {
            if (i > res) {
                break;
            }
            res += i;
        }
        return res;
    }
}
