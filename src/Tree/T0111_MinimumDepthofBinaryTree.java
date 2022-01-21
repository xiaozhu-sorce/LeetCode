package Tree;

import java.util.*;

public class T0111_MinimumDepthofBinaryTree {
    int res = 0;
    int depth = 1;
    List<Integer> list;

    public int minDepth1(TreeNode root) {
        list = new ArrayList<>();
        traverse(root);

        list.sort(Comparator.naturalOrder());
        if(list.size() > 0)
            return list.get(0);
        else
            return 0;
    }

    public void traverse(TreeNode root){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            list.add(depth);
        }

        depth++;
        traverse(root.left);
        traverse(root.right);
        depth--;
    }


    public int minDepth2(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int ans = Integer.MAX_VALUE;
        if(root.left != null)
            ans = Math.min(minDepth2(root.left),ans);
        if(root.right != null)
            ans = Math.min(minDepth2(root.right),ans);
        return ans + 1;
    }

    public int minDepth3(TreeNode root){
        if(root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0;i <size;i++) {
                TreeNode node = q.poll();

                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}