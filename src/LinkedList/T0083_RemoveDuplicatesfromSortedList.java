package LinkedList;

public class T0083_RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-2);
        dummy.next  = head;
        ListNode slow,fast;
        slow = dummy;
        fast = head;
        while(fast != null){
            while(fast.next != null && slow.val == fast.val){
                fast = fast.next;
            }
            if(fast.next == null && slow.val == fast.val){
                slow.next = null;
                break;
            }

            if(slow.next == fast){
                slow =slow.next;
                fast = fast.next;
            }else{
                slow.next = fast;
            }
        }
        return dummy.next;
    }

    //递归求解，一定要把递归的想成你想要的操作，最好不要跳进递归！
    //在这里deletDulicates2(hea.nextd)相当于是把head.next这一整个链表都已经删除了相同的元素。
    public ListNode deleteDuplicates2(ListNode head) {
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicates2(head.next);
        if(head.val == head.next.val)
            return head.next;
        else
            return head;

    }
}
