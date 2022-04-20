package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class T0388_LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        Deque<Integer> stack = new ArrayDeque<>();
        int p = 0;
        int depth, res = 0;
        boolean isFlag;
        while (p < input.length()) {
            isFlag = false;
            depth = 1;
            while (p < input.length() && input.charAt(p) == '\t') {
                depth++;
                p++;
            }

            int len = 0;
            while (p < input.length() && input.charAt(p) != '\n') {
                if (input.charAt(p) == '.')
                    isFlag = true;
                len++;
                p++;
            }
            p++;

            while (stack.size() >= depth) {
                stack.pop();
            }

            if (!stack.isEmpty())
                len += stack.peek() + 1;

            if (isFlag)
                res = Math.max(res, len);
            else
                stack.push(len);
        }
        return res;
    }
}
