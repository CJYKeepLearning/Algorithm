//根据前序和中序遍历序列构造二叉树
public class LC_105 {
    public static Node buildTree(int[] preorder,int[] inorder){
        return build(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1);
    }
    public static Node build(int[] preorder,int preStart,int preEnd,
                            int[] inorder,int inStart,int inEnd){
        if (preStart>preEnd)
            return null;
        int rootVal = preorder[preStart];
        Node root = new Node(rootVal);
        int index = 0;
        for (int i=inStart;i<=inEnd;i++){
            if (inorder[i]==rootVal){
                index = i;
                break;
            }
        }
        int leftSize = index-inStart;
        root.left = build(preorder,preStart+1,preStart+leftSize,inorder,inStart,index-1);
        root.right = build(preorder,preStart+leftSize+1,preEnd,inorder,index+1,inEnd);
        return root;
    }
}
class Node{
    int val;
    Node left;
    Node right;
    Node[] adj;
    public Node(){}
    public Node(int val){
        this.val = val;
    }
}
