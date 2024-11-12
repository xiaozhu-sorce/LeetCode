package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 17:12
 **/
public class T1190_ReverseSubstringsBetweenEachPairofParentheses {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                StringBuilder tmp = new StringBuilder();
                tmp.append(stack.pop());
                tmp.append(sb.reverse());
                stack.push(tmp.toString());
                sb = tmp;
            } else if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else
                sb.append(ch);
        }
        return sb.toString();
    }
}
