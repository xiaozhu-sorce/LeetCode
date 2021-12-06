package Tree;

public class T0700_SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int target) {
        //base case:
        if (root == null) {
            return null;
        }
        // Search left tree
        if (root.val > target) {
            return searchBST(root.left, target);
        }
        // Search right tree
        if (root.val < target) {
            return searchBST(root.right, target);
        }
        return root;
    }
}
