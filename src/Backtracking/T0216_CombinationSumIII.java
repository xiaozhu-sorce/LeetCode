package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 20:11
 **/
public class T0216_CombinationSumIII {
    List<List<Integer>> lists;

    public void backtrack(int k, int n,int start, LinkedList<Integer> l) {
        if (k == 0) {
            if (n == 0) lists.add(new LinkedList<>(l));
            return;
        }
        if (k < 0) return;

        if(n < 0) return;
        for (int i = start; i < 10; i++) {
            l.add(i);
            backtrack(k - 1, n - i,i+1, l);
            l.removeLast();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        lists = new LinkedList<>();
        backtrack(k, n, 1,new LinkedList<>());
        return lists;
    }
}
