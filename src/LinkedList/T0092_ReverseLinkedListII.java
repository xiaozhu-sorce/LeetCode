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

    public ListNode reverseBetween2(ListNode head, int left, int right) {
        if(left == 1){
            return reverse(head,right);
        }
        head.next = reverseBetween2(head.next, left - 1, right - 1);
        return head;
    }

    ListNode successor;
    //反转前n个节点
    public ListNode reverse(ListNode head,int n){
        if(n == 1){
            successor = head.next;
            return head;
        }

        //返回反转之后的链表的头节点
        ListNode last = reverse(head.next,n-1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
