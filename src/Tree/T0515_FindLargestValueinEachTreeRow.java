package Tree;

import java.util.*;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-06-24 09:02
 **/
public class T0515_FindLargestValueinEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)   return list;
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int l = Integer.MIN_VALUE;
            for(int i = 0; i < size;i++){
                TreeNode node = q.poll();
                l = Math.max(l,node.val);
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
