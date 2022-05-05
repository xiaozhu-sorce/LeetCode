package Tree;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class T1305_AllElementsinTwoBinarySearchTrees {
    List<Integer> list = new LinkedList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverse(root1);
        traverse(root2);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        return list;
    }

    void traverse(TreeNode root){
        if (root == null)
            return;

        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}
