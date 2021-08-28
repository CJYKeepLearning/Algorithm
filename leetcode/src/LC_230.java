import java.util.ArrayList;

public class LC_230 {
    public static int res = 0;
    public static int rank = 0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return res;
    }
    public static void traverse(TreeNode root,int k){
        if (root==null) return;
        traverse(root.left,k);
        rank++;
        if (k==rank){
            res = root.val;
            return;
        }
        traverse(root.right,k);
    }
}
