package Tree;

public class T1373_MaximumSumBSTinBinaryTree {
    private int maxSum = 0;
    public int maxSumBST(TreeNode root) {
        traverse(root);
        return maxSum;
    }

    //int[] = {以root为根的二叉树是否为BST，以root为根的二叉树的最小值，以root为根的二叉树的最大值，以root为根的二叉树的所有节点之和}
    public int[] traverse(TreeNode root){
        if(root == null){
            return new int[]{
                    1,Integer.MAX_VALUE,Integer.MIN_VALUE,0
            };
        }

        int[] left = traverse(root.left);
        int[] right = traverse(root.right);

        int[] res = new int[4];
        if(left[0] == 1 && right[0] == 1 && root.val < right[1] && root.val > left[2] ){
            res[0] = 1;
            res[1] = Math.min(left[1],root.val);
            res[2] = Math.max(right[2],root.val);
            res[3] = left[3] + right[3] + root.val;

            maxSum = Math.max(res[3],maxSum);
        }else{
            res[0] = 0;
        }
        return res;
    }
}
