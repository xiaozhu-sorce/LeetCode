package Tree;

public class T0226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        //前序和后序遍历都可以
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
