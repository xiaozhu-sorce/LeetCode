package LinkedList;

public class T0237_DeleteNodeinaLinkedList
{
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
