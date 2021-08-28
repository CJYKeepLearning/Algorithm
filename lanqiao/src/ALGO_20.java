import java.util.Scanner;

public class ALGO_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        MyTreeNode root = buildTree(s1,s2);
        printTree(root);
    }
    public static void printTree(MyTreeNode root){
        if (root!=null){
            System.out.print(root.val);
        }else
            return;
        printTree(root.left);
        printTree(root.right);
    }
    public static MyTreeNode buildTree(String inorder,String postorder){
        return build(inorder,0,inorder.length()-1,
                postorder,0,postorder.length()-1);
    }
    public static MyTreeNode build(String inorder,int inStart,int inEnd,
                                 String postorder,int postStart,int postEnd){
        if (inStart > inEnd)
            return null;
        char rootVal = postorder.charAt(postEnd);
        int index = inorder.indexOf(rootVal);
        MyTreeNode root = new MyTreeNode();
        int leftSize = index-inStart;
        root.val = rootVal;
        root.left = build(inorder,inStart,index-1,
                postorder,postStart,postStart+leftSize-1);
        root.right = build(inorder,index+1,inEnd,
                postorder,postStart+leftSize,postEnd-1);
        return root;
    }
}
class MyTreeNode{
    char val;
    MyTreeNode left;
    MyTreeNode right;
}
