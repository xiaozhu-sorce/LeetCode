package Tree;

import java.util.LinkedList;
import java.util.List;

public class T0094_BinaryTreeInorderTraversal {
    List<Integer> list;

    public List<Integer> inorderTraversal(TreeNode root) {
        list = new LinkedList<>();
        traverse(root);
        return list;
    }

    public void traverse(TreeNode node){
        if(node == null)
            return;
        traverse(node.left);
        list.add(node.val);
        traverse(node.right);
    }
}
