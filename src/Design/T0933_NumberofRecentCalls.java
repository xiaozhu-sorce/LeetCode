package Design;

import java.util.ArrayDeque;
import java.util.Queue;

public class T0933_NumberofRecentCalls {
    Queue<Integer> queue;

    public T0933_NumberofRecentCalls() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
