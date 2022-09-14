package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-09-14 18:52
 **/
public class T1619_MeanofArrayAfterRemovingSomeElements {
    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length/20;
        int an = 0;

        for (int i = len; i < arr.length-len; i++) {
            an += arr[i];
        }

        return an * 1.0 / (arr.length * 0.9);
    }
}
