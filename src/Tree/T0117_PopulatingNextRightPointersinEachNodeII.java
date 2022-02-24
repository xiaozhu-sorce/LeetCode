package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class T0117_PopulatingNextRightPointersinEachNodeII {
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();

            Node pre = null;
            for (int i = 0 ; i < size ; i++){
                Node cur = q.poll();

                if(pre != null)
                    pre.next = cur;
                pre = cur;
                if(root.left != null)   q.offer(root.left);
                if(root.right != null)   q.offer(root.right);
            }

        }
        return root;
    }
}
