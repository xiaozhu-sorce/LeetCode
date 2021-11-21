package LinkedList;

public class T0234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        ListNode newHead = new ListNode(0);
        ListNode node = newHead;

        while(cur != null){
            node.next = new ListNode(cur.val);
            node = node.next;
            cur = cur.next;
        }

        newHead = newHead.next;

        cur = reverseList2(newHead);
        while(head != null && cur != null){
            if(cur.val != head.val){
                return false;
            }
            head = head.next;
            cur = cur.next;
        }
        return true;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode pre = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return pre;
    }
}
