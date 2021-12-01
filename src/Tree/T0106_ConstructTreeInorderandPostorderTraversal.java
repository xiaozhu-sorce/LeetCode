package Tree;

public class T0106_ConstructTreeInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0,inorder.length - 1,postorder,0,postorder.length -1);
    }

    public TreeNode build(int[] inorder,int inStart,int inEnd,int[] postorder,int poStart,int poEnd){
        if(inStart > inEnd){
            return null;
        }

        int rootVal = postorder[poEnd];
        int index = 0;
        for(int i = inStart;i <= inEnd;i++){
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }

        int leftSize = index - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(inorder,inStart,index - 1,postorder,poStart,poStart + leftSize - 1);
        root.right = build(inorder,index+1,inEnd,postorder,poStart + leftSize ,poEnd - 1);
        return root;
    }
}
