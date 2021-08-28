package Offer;


public class Offer_55 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        boolean f = isBalanced(root);
        int d = deep(root, 0);
        System.out.println(d);
        //System.out.println(f);
    }

    public static boolean isBalanced(TreeNode root) {
            if (root == null)
                return true;
            if (isBalanced(root.left) && isBalanced(root.right)) {
                int l = deep(root.left, 0);
                int r = deep(root.right, 0);
                if (Math.abs(l - r) <= 1)
                    return true;
                else
                    return false;
            } else
                return false;
    }
        public static int[] deep = new int[Integer.MAX_VALUE];
        public static int deep (TreeNode root,int i){
            if (root == null) {
                deep[i] = 0;
                return deep[i];
            }

            if (deep[i] != 0)
                return deep[i];
            if (root.left == null && root.right == null)
                deep[i] = 1;
            else {
                deep[i] = Math.max(deep(root.left, i + 1), deep(root.right, i + 2)) + 1;
            }
            return deep[i];
        }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
