package Tree;

import java.util.LinkedList;
import java.util.List;

public class T0095_UniqueBinarySearchTreesii {
    public List<TreeNode> generateTrees(int n) {

        return build(1,n);
    }

    public List<TreeNode> build(int lo,int hi){
        List<TreeNode> res = new LinkedList<>();
        if(lo > hi){
            res.add(null);
            return res;
        }


        for(int i = lo;i <= hi ; i++)
        {
            List<TreeNode> leftTree = build(lo,i-1);
            List<TreeNode> rightTree = build(i+1,hi);
            for(TreeNode left : leftTree){
                for(TreeNode right : rightTree){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }

        return res;
    }
}
