package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T0102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i < size;i++){
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            list.add(l);
        }
        return list;
    }
}
