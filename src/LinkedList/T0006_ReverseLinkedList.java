package LinkedList;

public class T0006_ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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
