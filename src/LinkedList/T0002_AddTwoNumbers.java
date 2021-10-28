package LinkedList;

public class T0002_AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head  = null;
        ListNode tail = null;
        int flag = 0,sum;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + flag;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            if(sum >= 0 && sum <= 9){
                flag = 0;
            }else{
                flag = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            sum  = l1.val + flag;
            if(sum > 9){
                flag = 1;
            }else{
                flag = 0;
            }
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            l1 = l1.next;
        }

        while(l2 != null){
            sum = l2.val + flag;
            if(sum > 9){
                flag = 1;
            }else{
                flag = 0;
            }
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            l2 = l2.next;
        }
        if(flag == 1){
            tail.next = new ListNode(1);
            tail = tail.next;
        }
        return head;
    }
}
