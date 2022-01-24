package Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T0101_SymmetricTree {
    public boolean isSymmetric1(TreeNode root) {
        if(root == null) return true;
        return check(root.left,root.right);
    }

    public boolean check(TreeNode left,TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return check(left.left,right.right) && check(left.right,right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            list.clear();
            for (int i = 0;i <size;i++) {
                TreeNode node = q.poll();
                if(node!=null)
                    list.add(node.val);
                else{
                    list.add(null);
                    continue;
                }
                q.offer(node.left);
                q.offer(node.right);
            }
            if(!isSym(list))
                return false;
        }
        return true;
    }

    boolean isSym(List<Integer> list){
        int left = 0, right = list.size()-1;
        while(left < right){
            if(list.get(left++)!=(list.get(right--)))
                return false;
        }
        return true;
    }
}
