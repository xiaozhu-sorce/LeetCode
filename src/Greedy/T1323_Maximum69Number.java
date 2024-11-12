package Greedy;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-14 20:15
 **/
public class T1323_Maximum69Number {
    public int maximum69Number (int num) {
        return Integer.valueOf(String.valueOf(num).replaceFirst("6", "9"));
    }
}
