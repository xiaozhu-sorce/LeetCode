package Tree;

public class T0124_BinaryTreeMaximumPathSum {
    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        maxDepth(root);
        return res;
    }

    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;

        int left = Math.max(0,maxDepth(root.left));
        int right = Math.max(0,maxDepth(root.right));
        res = Math.max(res,left+right+root.val);

        return Math.max(left,right)+root.val;
    }
}
