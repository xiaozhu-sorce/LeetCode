package Recursion;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-20 21:23
 **/
public class T0779_K_thSymbolinGrammar {
    public int kthGrammar(int n, int k) {
        if (k == 1) return 0; // 向上遍历到了第1行，则返回结果
        if (k > (1 << n - 2)) return 1 ^ kthGrammar(n - 1, k - (1 << n - 2)); // 如果在“蓝色区间”，则与上一行值相反
        else return kthGrammar(n - 1, k); // 如果在“黄色区间”，则与上一行值相同
    }

}
