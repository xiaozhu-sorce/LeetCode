package Tree;

import java.util.ArrayList;

public class T0653_TwoSumIV_InputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        traverse(list,root);
        int i = 0 , j = list.size()-1;
        while (i < j){
            int sum = list.get(i) + list.get(j);
            if(sum < k){
                i++;
            }else if(sum > k){
                j--;
            }else{
                return true;
            }
        }
        return false;

    }

    public void traverse(ArrayList<Integer> list,TreeNode root){
        if(root == null)
            return;
        traverse(list,root.left);
        list.add(root.val);
        traverse(list,root.right);
    }
}
