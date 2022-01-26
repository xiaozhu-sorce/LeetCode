package Tree;

public class T0104_MaximumDepthofBinaryTree {
    int res = 0;
    int depth = 0;

    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    public void traverse(TreeNode root){
        if(root == null){
            return ;
        }

        depth++;
        res = Math.max(depth,res);
        traverse(root.left);
        traverse(root.right);
        depth--;
    }


    public int maxDepth2(TreeNode root) {
        if(root == null)
            return 0;

        return Math.max(maxDepth2(root.left),maxDepth2(root.right)) + 1;
    }
}
