package LinkedList;

public class T0061_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy,slow=dummy;

        int i = 0;

        while(fast.next != null){
            fast = fast.next;
            i++;
        }

        for(int j = i-k%i;j > 0;j--){
            slow = slow.next;
        }

        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}
