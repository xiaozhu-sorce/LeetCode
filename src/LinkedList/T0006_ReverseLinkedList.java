package LinkedList;

public class T0006_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode s;
        head = null;
        while(p != null){
            s = p;
            p = p.next;
            s.next = head;
            head = s;
        }
        return head;
    }
}
