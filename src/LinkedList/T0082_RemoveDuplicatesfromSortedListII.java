package LinkedList;

public class T0082_RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre,cur;
        pre = dummy;
        cur = dummy.next;
        while(cur != null){
            while(cur.next != null && pre.next.val == cur.next.val){
                cur = cur.next;
            }
            if(pre.next != cur){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
