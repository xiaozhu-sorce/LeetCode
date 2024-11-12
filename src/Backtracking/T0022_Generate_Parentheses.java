package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-14 20:27
 **/
public class T0022_Generate_Parentheses {
    // 回溯过程中的路径
    StringBuilder track = new StringBuilder();
    // 记录所有合法的括号组合
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) return res;
        backtrack(n, n);
        return res;
    }

    // 可用的左括号数量为 left 个，可用的右括号数量为 right 个
    private void backtrack(int left, int right) {
        // 若左括号剩下的多，说明不合法
        if (right < left) return;
        // 数量小于 0 肯定是不合法的
        if (left < 0) return;
        // 当所有括号都恰好用完时，得到一个合法的括号组合
        if (left == 0 && right == 0) {
            res.add(track.toString());
            return;
        }

        // 做选择，尝试放一个左括号
        track.append('(');
        backtrack(left - 1, right);
        // 撤消选择
        track.deleteCharAt(track.length() - 1);

        // 做选择，尝试放一个右括号
        track.append(')');
        backtrack(left, right - 1);
        // 撤销选择
        track.deleteCharAt(track.length() - 1);
    }
}