package Tree;

import java.util.ArrayList;
import java.util.List;

public class T0144_BinaryTreePreorderTraversal {
    List<Integer> lists = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return lists;
    }

    public void traverse(TreeNode node){
        if(node == null){
            return;
        }
        lists.add(node.val);
        traverse(node.left);
        traverse(node.right);   
    }
}