package Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T0103_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null)
            return list;
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> l = new LinkedList<>();
            for(int i = 0; i < size;i++){
                TreeNode node = q.poll();
                if(flag)
                    l.addLast(node.val);
                else
                    l.addFirst(node.val);

                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            flag = !flag;
            list.add(l);
        }
        return list;
    }
}
