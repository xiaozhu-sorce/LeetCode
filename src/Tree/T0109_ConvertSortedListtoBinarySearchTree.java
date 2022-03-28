package Tree;

import LinkedList.ListNode;
import java.util.ArrayList;

public class T0109_ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int[] nums = new int[list.size()];
        for (int i = 0 ;i < list.size();i++){
            nums[i] = list.get(i);
        }
        return sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    public TreeNode build(int[] nums,int l,int r){
        if(l > r)
            return null;
        int mid = (l + r)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = build(nums,l,mid-1);
        node.right = build(nums,mid+1,r);
        return node;
    }
}
