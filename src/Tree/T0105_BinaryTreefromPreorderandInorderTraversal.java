package Tree;

public class T0105_BinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length - 1,inorder,0,inorder.length - 1);
    }

    public TreeNode build(int[] preorder,int preleft,int preright,int[] inorder,int inleft,int inright){
        if(preleft > preright){
            return null;
        }

        int rootVal = preorder[preleft];
        int index = 0;
        for(int i = inleft;i <= inright;i++){
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }

        int leftsize = index - inleft;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder,preleft+1,preleft+leftsize,inorder,inleft,index-1);
        root.right = build(preorder,preleft+leftsize+1,preright,inorder,index+1,inright);
        return root;
    }
}
