package Tree;

public class T0563_BinaryTreeTilt {
    int num = 0;
    public int findTilt(TreeNode root) {
        diff(root);
        return num;
    }

    public int diff(TreeNode root){
        if(root == null) return 0;
        int left = diff(root.left);
        int right = diff(root.right);
        num += Math.abs(left - right);
        return left + right + root.val;
    }
}
