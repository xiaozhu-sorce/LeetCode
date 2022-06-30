package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-06-30 22:55
 **/
public class T1175_PrimeArrangements {
    static int Mod = (int) 1e9 + 7;
    static int[] cnt = new int[101];

    static {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            boolean ok = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) ok = false;
            }
            if (ok) list.add(i);
            cnt[i] = list.size();
        }

    }

    public int numPrimeArrangements(int n) {
        int m = cnt[n];
        int b = n - m;
        long num = 1;

        for (int i = m; i > 1; i--) num = num * i % Mod;
        for (int i = b; i > 1; i--) num = num * i % Mod;

        return (int) num;
    }
}
