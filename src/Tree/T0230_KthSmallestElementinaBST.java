package Tree;

public class T0230_KthSmallestElementinaBST {
    private int res = 0;
    private int num = 0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return res;
    }

    public void traverse(TreeNode root,int k){
        if(root == null){
            return;
        }

        traverse(root.left,k);

        num++;
        if(num == k){
            res = root.val;
            return;
        }
        traverse(root.right,k);
    }
}
