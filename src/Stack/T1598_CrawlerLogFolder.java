package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-09-09 08:19
 **/
public class T1598_CrawlerLogFolder {
    public int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();

        for (String s : logs) {
            if (s.charAt(0) != '.'){
                stack.push(s);
            } else {
                if (s.charAt(1) == '.' && s.charAt(2) == '/')
                    if (!stack.isEmpty())
                        stack.pop();
            }
        }

        return stack.size();
    }
}
