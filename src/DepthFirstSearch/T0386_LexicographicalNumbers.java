package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class T0386_LexicographicalNumbers {
    List<Integer> list = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= 9; i++) traverse(i, n);
        return list;
    }

    public void traverse(int cur, int limit) {
        if (cur > limit)
            return;
        list.add(cur);
        for (int i = 0; i <= 9; i++)
            traverse(cur * 10 + i, limit);
    }

    public List<Integer> lexicalOrder2(int n) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0, j = 1; i < n; i++) {
            res.add(j);
            if (j * 10 <= n)
                j *= 10;
            else {
                while (j % 10 == 9 || j + 1 > n)
                    j /= 10;
                j++;
            }
        }

        return res;
    }
}
