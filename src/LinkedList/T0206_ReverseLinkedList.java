package LinkedList;

public class T0206_ReverseLinkedList {
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

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode pre = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return pre;
    }
}
