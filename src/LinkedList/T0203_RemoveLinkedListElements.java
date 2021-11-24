package LinkedList;

public class T0203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode node = head;
        ListNode pre = dummy;

        if(node == null){
            return head;
        }


        while(node != null && node.next != null){
            if(node.val == val){
                pre.next = node.next;
                node = node.next;
            }else{
                node = node.next;
                pre = pre.next;
            }
        }
        if(node.val == val){
            pre.next = node.next;
        }
        return dummy.next;
    }
}
