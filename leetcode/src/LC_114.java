public class LC_114 {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        TreeNode p = root;
        while(p.right != null){
            p = p.right;
        }
        p.right = right;
    }
    TreeNode seekRight(TreeNode root){
        TreeNode res = root;
        while(res.right != null){
            res = res.right;
        }
        return res;
    }
}
