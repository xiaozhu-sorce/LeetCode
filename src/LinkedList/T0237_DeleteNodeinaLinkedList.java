package LinkedList;

public class T0237_DeleteNodeinaLinkedList
{
    public class ListNode {
        int val;
        T0002_AddTwoNumbers.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, T0002_AddTwoNumbers.ListNode next) { this.val = val; this.next = next; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
