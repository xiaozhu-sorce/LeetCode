package LinkedList;

public class T0234_PalindromeLinkedList {
    //反转链表。
    public boolean isPalindrome1(ListNode head) {
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


    //递归
    ListNode left;

    public boolean isPalindrome2(ListNode head) {
        left = head;
        return traverse(head);
    }

    public boolean traverse(ListNode right){
        if(right == null) return true;
        boolean res = traverse(right.next);
        res = res && left.val == right.val;
        left = left.next;
        return res;
    }
}
