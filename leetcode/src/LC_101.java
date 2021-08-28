import java.util.LinkedList;
import java.util.List;

public class LC_101 {
    public static void main(String[] args) {
        TreeNode p1 =
                new TreeNode(1,
                new TreeNode(2,new TreeNode(3),new TreeNode(4)),
                new TreeNode(2,new TreeNode(4),new TreeNode(3))
                );

        TreeNode p2 =
                new TreeNode(1,
                        new TreeNode(2,new TreeNode(),new TreeNode(3)),
                        new TreeNode(2,new TreeNode(),new TreeNode(3))
                );

        TreeNode p3 =
                new TreeNode(1,
                        new TreeNode(2,new TreeNode(2),null),
                        new TreeNode(2,new TreeNode(2),null)
                );
        System.out.println(isSymmetric(p1)+" "+isSymmetric(p2)+" "+isSymmetric(p3));
    }
    public static boolean isSymmetric(TreeNode root) {
        inorderTraversal(root);
        for (int i=0;i<=(inorder.size()-1)/2;i++){
            if (inorder.get(i)!=inorder.get(inorder.size()-1-i))
                return false;
        }
        return true;
    }
    static List<Integer> inorder = new LinkedList<>();
    public static void inorderTraversal(TreeNode root){
        if (root==null){
            inorder.add(0);
            return;
        }
        inorderTraversal(root.left);
        inorder.add(root.val);
        inorderTraversal(root.right);
    }
}
