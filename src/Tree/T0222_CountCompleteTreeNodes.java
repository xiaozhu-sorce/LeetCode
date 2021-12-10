package Tree;

public class T0222_CountCompleteTreeNodes {
    public int countNodes1(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = countNodes1(root.left);
        int right = countNodes1(root.right);
        return 1+left+right;
    }


    public int count = 0;
    public int countNodes2(TreeNode root) {
        if(root == null){
            return 0;
        }
        count++;
        int left = countNodes2(root.left);
        int right = countNodes2(root.right);
        return count;
    }

    //时间复杂度最低 O（logN*logN）
    public int countNodes3(TreeNode root) {
        TreeNode le = root;
        TreeNode ri = root;
        int hl = 0;
        int hr = 0;
        while(le != null){
            le = le.left;
            hl++;
        }

        while(ri != null){
            ri = ri.right;
            hr++;
        }

        if(hl == hr){
            return (int)Math.pow(2, hl) - 1;
        }

        int count1 = countNodes3(root.left);
        int count2 = countNodes3(root.right);
        return count1 + count2 + 1;
    }
}
