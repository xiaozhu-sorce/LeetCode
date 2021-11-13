package LinkedList;

public class T0024_SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode p = head;
        ListNode temp,pre = null;
        if (head!=null && head.next!=null)
            head = head.next;
        while(p!=null && p.next != null && p.next.next !=null){
            temp  = p.next;
            p.next = temp.next;
            temp.next = p;
            if(pre != null)
                pre.next = temp;
            pre = p;
            p = p.next;
        }
        if(p!=null && p.next!=null){
            temp  = p.next;
            if(pre!=null)
                pre.next = temp;
            temp.next = p;
            p.next = null;
        }
        return head;
    }
}
