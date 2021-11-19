package LinkedList;

public class T0092_ReverseLinkedListII {
    public ListNode reverseBetween1(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode le = dummy;
        int i;
        for(i = 0;i < left - 1;i++)
            le = le.next;
        ListNode start = le.next;
        ListNode after = start.next;

        for(i = 0;i < right - left;i++){
            start.next = after.next;
            after.next = le.next;
            le.next = after;
            after = start.next;
        }
        return dummy.next;
    }
}
