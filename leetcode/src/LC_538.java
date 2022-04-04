public class LC_538 {
    public static void main(String[] args) {

    }
    public static int sum = 0;
    TreeNode convertBST(TreeNode root){
        convert(root);
        return root;
    }
    int preSum = 0;
    private void convert(TreeNode root) {
        if (root == null)
            return;
        convert(root.right);
        root.val = preSum + root.val;
        preSum = root.val;
        convert(root.left);
    }
}
