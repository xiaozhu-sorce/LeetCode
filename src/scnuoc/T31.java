package scnuoc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 17:12
 **/
public class T31 {
    public static String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(reverseParentheses(str));
    }
}
