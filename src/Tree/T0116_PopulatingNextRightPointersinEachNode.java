package Tree;

public class T0116_PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        connectNode(root.left,root.right);
        return root;
    }
    public void connectNode (Node root1,Node root2){
        if(root1 == null || root2 == null){
            return ;
        }
        root1.next = root2;
        connectNode(root1.left,root1.right);
        connectNode(root2.left,root2.right);
        connectNode(root1.right,root2.left);
    }
}