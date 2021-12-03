package Tree;

public class T0538_ConvertBSTtoGreaterTree {
    private int res = 0;
    public TreeNode convertBST(TreeNode root) {
        covert(root);
        return root;
    }

    public void covert(TreeNode root){
        if(root == null) return;

        covert(root.right);
        res+=root.val;
        root.val = res;
        covert(root.left);
    }
}
