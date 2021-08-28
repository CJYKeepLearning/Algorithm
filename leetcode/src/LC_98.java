public class LC_98 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        isValid(root,null,null);
    }
    public static boolean isValid(TreeNode root,TreeNode min,TreeNode max){
        if(root == null )
            return true;
        if(min!=null && root.val<=min.val) return false;
        if(max!=null && root.val>=max.val) return false;
        return isValid(root.left,min,root)&&isValid(root.right,root,max);
    }
}
