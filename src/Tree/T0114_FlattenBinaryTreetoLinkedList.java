package Tree;

public class T0114_FlattenBinaryTreetoLinkedList {
    //递归求解！！ 发现了题目的规律以后就可以使用递归，把你想要的结果想进去递归，不要跳进去递归！
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right != null){
            root = root.right;
        }
        root.right = tmp;
    }
}
