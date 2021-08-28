import java.util.LinkedList;
import java.util.List;

public class LC_1382 {
    //有序链表转化成平衡二叉搜索树
    List<Integer> nums = new LinkedList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        res = bsf(0,nums.size()-1);
        return res;
    }
    TreeNode res;
    public TreeNode bsf(int left,int right){
        if (left>right)
            return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = bsf(left,mid-1);
        root.right = bsf(mid+1,right);
        return root;
    }
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        nums.add(root.val);
        inorder(root.right);
    }
}
