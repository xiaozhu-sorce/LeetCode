package LinkedList;

public class T0019_RemoveNthNodeFromEndofList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        int m = 0;
        while(tail != null){
            m++;
            tail = tail.next;
        }
        tail = head;
        for(int i = 0;i<m-n-1;i++){
            tail = tail.next;
        }

        if(n == m){
            head = head.next;
        }else if(n == 1){
            tail.next  = null;
        }
        else{
            tail.next = tail.next.next;
        }

        return head;
    }
}
