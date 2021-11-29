package Tree;

public class T0654_MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length - 1);
    }

    //该方法是对从lo到hi数组进行选择出最大的元素
    public TreeNode build(int[] nums,int lo,int hi){
        if(lo > hi) return null;

        int index = -1;
        int maxVal = Integer.MIN_VALUE;
        for(int i = lo;i <= hi;i++){
            if (maxVal < nums[i]) {
                index = i;
                maxVal = nums[i];
            }
        }

        TreeNode root = new TreeNode(maxVal);
        root.left = build(nums,lo,index - 1);
        root.right = build(nums,index + 1,hi);
        return root;
    }
}
