package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class T0385_MiniParser {
    int i = 0;
    public NestedInteger deserialize(String s) {
        if(s.charAt(0) != '[')
            return new NestedInteger(Integer.parseInt(s));
        return DFS(s.toCharArray());
    }

    public NestedInteger DFS(char s[]){
        if(s[i] == '['){
            i++;
            NestedInteger cur = new NestedInteger();
            while(s[i] != ']'){
                cur.add(DFS(s));
                if(s[i] == ',')
                    i++;
            }
            i++;
            return cur;
        } else { // 最后一个else处理数字
            boolean flag = false;
            if(s[i] == '-'){
                flag = true;
                i++;
            }
            int num = 0;
            while(i < s.length && Character.isDigit(s[i])){
                num = num * 10 + s[i] - '0';
                i++;
            }
            if(flag)    num *= -1;
            return new NestedInteger(num);
        }
    }

    public NestedInteger deserialize2(String s){
        if(s.charAt(0) != '[')
            return new NestedInteger(Integer.parseInt(s));
        Deque<NestedInteger> stack = new ArrayDeque<>();
        char[] sh = s.toCharArray();
        int num = 0;
        boolean flag = false;
        for(int i = 0;i < s.length();i++){
            if(sh[i] == '['){
                stack.push(new NestedInteger());
            } else if(Character.isDigit(sh[i])){
                num = num*10 + sh[i] - '0';
            } else if(sh[i] == '-'){
                flag = true;
            } else if(sh[i] == ']' || sh[i] == ','){
                if(Character.isDigit(sh[i-1])){
                    if(flag)
                        num *= -1;
                    stack.peek().add(new NestedInteger(num));
                }
                num = 0;
                flag = false;
                if(sh[i] == ']' && stack.size() > 1){
                    NestedInteger ni = stack.pop();
                    stack.peek().add(ni);
                }
            }
        }
        return stack.poll();
    }

}
