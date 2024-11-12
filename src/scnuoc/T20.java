package scnuoc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-15 23:54
 **/
public class T20 {
    static List<String> str = new LinkedList<>();
    static String[] mapping = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void backtrack(List<String> l, int depth, StringBuilder sb, int start) {
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


    public static List<String> letterCombinations(String digits) {
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        letterCombinations(s);

        System.out.print("[");
        for (int i = 0;i < str.size();i++){
            System.out.print(str.get(i));
            if (i < str.size()-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
