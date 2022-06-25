package DynamicProgramming;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-06-25 11:10
 **/
public class Offer_T091_粉刷房子 {
    public int minCost(int[][] costs) {
        int a = costs[0][0], b = costs[0][1], c = costs[0][2];

        for (int i = 1; i < costs.length; i++) {
            int d = costs[i][0] + Math.min(b, c);
            int e = costs[i][1] + Math.min(a, c);
            int f = costs[i][2] + Math.min(a, b);
            a = d;
            b = e;
            c = f;
        }

        return Math.min(a, Math.min(b, c));
    }
}
