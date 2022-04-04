public class LC_114 {
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(root.right);
        root.left = null;
        root.right = left;
        TreeNode p = left;
        while (p.right != null){
            p = p.right;
        }
        p.right = right;
    }
}
