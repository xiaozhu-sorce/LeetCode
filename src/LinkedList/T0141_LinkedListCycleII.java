package LinkedList;

public class T0141_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow,fast;
        slow = fast = dummy;
        int k = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            k++;
            if(slow == fast){
                break;
            }
        }
        slow = dummy;
        if(fast == null || fast.next == null)
            return null;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
