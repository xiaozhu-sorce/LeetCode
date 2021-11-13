package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T0637_AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int i;
        queue.offer(root);
        root = root.left;
        while(queue.size() != 0){
            Double num = 0.0;
            int n = queue.size();
            for(i = 0;i < n;i++){
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
                num+=node.val;
            }
            list.add(num/i);
        }
        return list;
    }
}
