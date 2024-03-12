package Stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-03-12 19:48
 **/
public class T0225_ImplementStackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public T0225_ImplementStackUsingQueues() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        if (!q1.isEmpty())
            q1.add(x);
        else
            q2.add(x);
    }

    public int pop() {
        int x ;
        if (!q1.isEmpty()){
            while(q1.size() > 1){
                q2.add(q1.poll());
            }
            x = q1.poll();
        }else{
            while(q2.size() > 1){
                q1.add(q2.poll());
            }
            x = q2.poll();
        }
        return x;
    }

    public int top() {
        int x = pop();
        if (q1.isEmpty())
            q2.add(x);
        else
            q1.add(x);

        return x;
    }

    public boolean empty() {
        if (q1.isEmpty() && q2.isEmpty())
            return true;
        return false;
    }
}
