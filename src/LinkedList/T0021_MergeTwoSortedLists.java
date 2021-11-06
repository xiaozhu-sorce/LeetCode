package LinkedList;

public class T0021_MergeTwoSortedLists
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pa,pb,rc;
        pa = l1;
        pb = l2;
        rc = new ListNode();
        ListNode head;
        if(l1 == null) head = l2;
        else if(l2 == null) head = l1;
        else head = l1.val<l2.val?l1:l2;
        while(pa != null && pb != null){
            if(pb.val <= pa.val){
                rc.next = pb;
                rc = pb;
                pb = pb.next;
            }else{
                rc.next = pa;
                rc = pa;
                pa = pa.next;
            }
        }

        rc.next = pa==null?pb:pa;
        return head;

    }
}
