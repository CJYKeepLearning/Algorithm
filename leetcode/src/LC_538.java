public class LC_538 {
    public static void main(String[] args) {

    }
    public static int sum = 0;
    TreeNode converBST(TreeNode root){
        traverse(root);
        return root;
    }
    public static  void traverse(TreeNode root){
       if (root==null) return;
        traverse(root.right);
        root.val = root.val+sum;
        sum = root.val;
        traverse(root.left);
    }
}
