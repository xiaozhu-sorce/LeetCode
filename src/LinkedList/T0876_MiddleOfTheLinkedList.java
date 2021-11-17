package LinkedList;

public class T0876_MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p,q;
        p = q = dummy;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }
        if(q != null){
            p = p.next;
        }
        return p;
    }
}
