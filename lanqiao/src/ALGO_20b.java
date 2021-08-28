import java.util.Scanner;

public class ALGO_20b {
    //根据前序和中序得到后序遍历序列
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        MyTreeNode root = buildTree(s1,s2);
        printTree(root);
    }
    public static void printTree(MyTreeNode root){
        if (root!=null){
            printTree(root.left);
            printTree(root.right);
            System.out.print(root.val);
        }else
            return;
    }
    public static MyTreeNode buildTree (String preorder,String inorder){
        return build(preorder,0,preorder.length()-1,inorder,0,inorder.length()-1);
    }
    public static MyTreeNode build(String preoder,int preStart,int preEnd,
                                   String inorder,int inStart,int inEnd){
        if (preStart>preEnd)
            return null;
        char rootVal = preoder.charAt(preStart);
        int index = inorder.indexOf(rootVal);
        int leftSize = index-inStart;
        MyTreeNode root = new MyTreeNode();
        root.val = rootVal;
        root.left = build(preoder,preStart+1,preStart+leftSize,
                inorder,inStart,index-1);
        root.right = build(preoder,preStart+leftSize+1,preEnd,
                inorder,index+1,inEnd);
        return root;
    }
}
