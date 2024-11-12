package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-11-03 22:28
 **/
public class T0638_ShoppingOffers {
    int n;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        this.n = price.size();
        Map<List<Integer>, Integer> cache = new HashMap<>();
        return dfs(price, special, needs, cache);
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<List<Integer>, Integer> cache) {
        if (cache.containsKey(needs)) {
            return cache.get(needs);
        }

        // 不使用大礼包的情况下
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += needs.get(i) * price.get(i);
        }

        // 使用大礼包的情况下
        for (List<Integer> s : special) {
            // 大礼包可以购买无限次
            List<Integer> curr = new ArrayList<>(needs);
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                // 判断是否超出数量限制
                if (curr.get(i) - s.get(i) < 0) {
                    flag = true;
                    break;
                }
                curr.set(i, curr.get(i) - s.get(i));
            }

            // 未超出数量限制
            if (!flag) {
                ans = Math.min(ans, s.get(n) + dfs(price, special, curr, cache));
            }
        }

        cache.put(needs, ans);

        return ans;
    }
}
