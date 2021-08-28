public class TreeNodeWays {
    public static void printTreeNode(TreeNode root){
        if (root==null){
            System.out.print("# ");
            return;
        }
        System.out.print(root.val+" ");
        printTreeNode(root.left);
        printTreeNode(root.right);
    }
}
