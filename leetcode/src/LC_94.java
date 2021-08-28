import java.util.LinkedList;
import java.util.List;

public class LC_94 {
    List<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        return res;
    }
    public void inorder(TreeNode root){
        if (root==null)
            return;
        else
            res.add(root.val);
        inorder(root.left);
        inorder(root.right);
    }
}
