package LinkedList;

import java.util.Random;

public class T0382_LinkedListRandomNode {
    ListNode head;
    Random r = new Random();

    public void Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        ListNode p = head;
        int i = 0;
        int res = 0;
        while(p != null){
            i++;
            if(0 == r.nextInt(i)){
                res = p.val;
            }
            p = p.next;
        }
        return res;
    }
}
