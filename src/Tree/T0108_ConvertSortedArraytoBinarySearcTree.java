package Tree;

public class T0108_ConvertSortedArraytoBinarySearcTree {
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
