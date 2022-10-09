package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-09 19:07
 **/
public class T0856_ScoreofParentheses {
    public int scoreOfParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char si : s.toCharArray()){
            if (si == '('){
                stack.push(si);
            }else{
                char ch  =stack.pop();
                if (ch == '(')
                    stack.push('1');
                else {
                    int num = ch-'0';
                    while((ch = stack.pop()) != '(')    num += ch-'0';
                    stack.push((char) ((num << 1) + '0'));
                }
            }
        }

        int num = 0;
        while (!stack.isEmpty())    num += stack.pop() - '0';
        return num;
    }
}
