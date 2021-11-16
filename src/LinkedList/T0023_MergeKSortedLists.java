package LinkedList;

import java.util.PriorityQueue;

public class T0023_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        PriorityQueue<ListNode> pq;

        if(lists.length >= 1)
            pq = new PriorityQueue<>(lists.length,(a,b) -> (a.val  - b.val));
        else
            return dummy.next;

        for(ListNode head : lists){
            if(head!=null){
                pq.add(head);
            }
        }

        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            p.next = node;
            if(node.next!=null){
                pq.add(node.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
