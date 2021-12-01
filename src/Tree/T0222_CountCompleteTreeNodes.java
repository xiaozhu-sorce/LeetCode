package Tree;

public class T0222_CountCompleteTreeNodes {
    public int countNodes1(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = countNodes1(root.left);
        int right = countNodes1(root.right);
        return 1+left+right;
    }


    public int count = 0;
    public int countNodes2(TreeNode root) {
        if(root == null){
            return 0;
        }
        count++;
        int left = countNodes2(root.left);
        int right = countNodes2(root.right);
        return count;
    }
}
