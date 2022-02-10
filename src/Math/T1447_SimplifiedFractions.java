package Math;

import java.util.LinkedList;
import java.util.List;

public class T1447_SimplifiedFractions {
    public List<String> simplifiedFractions(int n) {
        List<String> list = new LinkedList<>();
        for(int i = 1 ; i < n; i++){
            for(int j = i+1; j <= n; j++){
                if (gcd(i, j) == 1) list.add(i + "/" + j);
            }
        }

        return list;
    }

    int gcd(int a, int b) { // 欧几里得算法求最简公约数！！！
        return b == 0 ? a : gcd(b, a % b);
    }
}
