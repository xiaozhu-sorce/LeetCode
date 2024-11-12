package Backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-15 23:37
 **/
public class T0017_LetterCombinationsOfAPhoneNumber {
    List<String> str = new LinkedList<>();
    String[] mapping = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public void backtrack(List<String> l, int depth, StringBuilder sb, int start) {
        if (depth == l.size()) {
            str.add(sb.toString());
            return;
        }

        for (int i = start; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).length(); j++) {
                sb.append(l.get(i).charAt(j));
                backtrack(l, depth + 1, sb, i + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }


    public List<String> letterCombinations(String digits) {
        List<String> l = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        if (digits.isEmpty()) {
            return str;
        }

        for (int i = 0; i < digits.length(); i++) {
            l.add(mapping[digits.charAt(i) - '0']);
        }

        backtrack(l, 0, sb, 0);
        return str;
    }
}
