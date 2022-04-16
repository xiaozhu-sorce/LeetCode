package Contest.LeetCode_spring_contest;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class C0003 {
    //TL
    List<Integer> list;
    boolean[] visited;

    public int getNumber(TreeNode root, int[][] ops) {

        list = new ArrayList<>();
        traverse(root);
        int len = list.size();
        visited = new boolean[len];
        int num = 0;

        for (int[] op : ops) {
            int index = 0;

            while (list.get(index) < op[1]) index++;
            while (index < len && list.get(index) <= op[2]){
                visited[index] = op[0] == 1;
                index++;
            }
        }

        for (int i = 0; i < len; i++) {
            if (visited[i])
                num++;
        }
        return num;
    }

    public void traverse(TreeNode root) {
        if (root == null)
            return;

        traverse(root.left);
        list.add(root.val);
        traverse(root.right);

    }
}
