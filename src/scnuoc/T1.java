package scnuoc;

import java.util.Scanner;

public class T1 {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public static void print(TreeNode root) {
        if (root != null && root.left == null && root.right == null) {
            System.out.print(root.val + " ");
            return;
        } else if (root == null) {
            System.out.print("null ");
            return;
        } else
            System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length);
    }

    public static TreeNode build(int[] nums, int low, int high) {

        if (low >= high) {
            return null;
        }

        int index = -1, maxVal = Integer.MIN_VALUE;

        for (int i = low; i < high; i++) {
            if (maxVal < nums[i]) {
                maxVal = nums[i];
                index = i;
            }
        }

        //最大值作为跟节点
        TreeNode root = new TreeNode(maxVal);
        //递归左子树
        root.left = build(nums, low, index);
        //递归右子树
        root.right = build(nums, index + 1, high);
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] str = s.split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        print(constructMaximumBinaryTree(a));
    }
}
