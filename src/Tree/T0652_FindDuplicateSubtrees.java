package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class T0652_FindDuplicateSubtrees {
    HashMap<String,Integer> memo = new HashMap<>();

    LinkedList<TreeNode> res = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }


    String traverse(TreeNode root){
        if(root == null){
            return "#";
        }

        String left = traverse(root.left);
        String right = traverse(root.right);
        String subString = left + "," +right + "," + root.val;

        int fre = memo.getOrDefault(subString,0);
        if(fre == 1){
            res.add(root);
        }
        memo.put(subString,fre + 1);
        return subString;
    }
}
