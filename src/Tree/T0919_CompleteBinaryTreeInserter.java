package Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-07-25 19:35
 **/
public class T0919_CompleteBinaryTreeInserter {
    Deque<TreeNode> q = new LinkedList<>();
    TreeNode root;

    public T0919_CompleteBinaryTreeInserter(TreeNode root) {
        this.root = root;
        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(root);

        while (!temp.isEmpty()) {
            TreeNode cur = temp.poll();
            if (cur.left != null)
                temp.offer(cur.left);
            if (cur.right != null)
                temp.offer(cur.right);
            if (cur.left == null || cur.right == null)
                q.offer(cur);
        }
    }

    public int insert(int val) {
        TreeNode c = q.peek();
        TreeNode node = new TreeNode(val);
        if (c.left == null)
            c.left = node;
        else if (c.right == null){
            c.right = node;
            q.poll();
        }
        q.offer(node);
        return c.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
