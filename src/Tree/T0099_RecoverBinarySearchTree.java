package Tree;

public class T0099_RecoverBinarySearchTree {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inorder(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void inorder(TreeNode root){
        if(root == null)
            return;

        inorder(root.left);

        if(root.val < pre.val) {
            if(first == null)
                first =  pre;
            second = root;
        }

        pre = root;
        inorder(root.right);
    }
}
