package Tree;

import java.util.LinkedList;
import java.util.List;

public class T0113_PathSumII {
    List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return lists;
        trav(root, 0, targetSum, new LinkedList<>());
        return lists;
    }

    public void trav(TreeNode root,int sum,int targetsum,LinkedList<Integer> l){
        if(root == null)
            return;

        sum+=root.val;
        if (root.left == null && root.right == null) {
            if(sum == targetsum){
                l.addLast(root.val);
                lists.add(new LinkedList<>(l));
                l.removeLast();
                sum-=root.val;
                return;
            }
        }
        sum-=root.val;

        l.addLast(root.val);
        sum+=root.val;

        trav(root.left, sum, targetsum, l);
        trav(root.right, sum, targetsum, l);

        sum-=root.val;
        l.removeLast();
    }
}
