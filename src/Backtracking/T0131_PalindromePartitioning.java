package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-15 18:51
 **/
public class T0131_PalindromePartitioning {
    List<List<String>> lists;
    int[][] flag;

    public int isPartition(String s, int i, int j) {
        if (flag[i][j] != 0)
            return flag[i][j];
        int f = s.charAt(i) == s.charAt(j) ? 1 : -1;
        if (i > j)
            return f;
        if (i == j)
            return 1;
        return f > 0 && isPartition(s, i + 1, j - 1) > 0 ? 1 : -1;
    }

    public void dfs(String s, int start, LinkedList<String> res) {
        if (start == s.length()) {
            lists.add(new ArrayList<>(res));
        }
        for (int i = start; i < s.length(); i++) {
            if (isPartition(s, start, i) > 0) {
                res.add(s.substring(start, i));
                dfs(s, start + 1, res);
                res.removeLast();
            }
        }
    }

    public List<List<String>> partition(String s) {
        int len = s.length();
        flag = new int[len][len];
        lists = new ArrayList<>();
        LinkedList<String> res = new LinkedList<>();
        dfs(s, 0, res);
        return lists;
    }
}
