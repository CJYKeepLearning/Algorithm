public class LC_450 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        deleteNode(root,50);
        TreeNodeWays.printTreeNode(root);
    }
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null && root.right==null)
                return null;
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;

            TreeNode min = getMain(root.right);
            root.val = min.val;
            root.right = deleteNode(root.right,min.val);
        }
        else if(root.val<key)
            root.right = deleteNode(root.right,key);
        else if(root.val>key)
            root.left = deleteNode(root.left,key);
        return root;
    }
    public static TreeNode getMain(TreeNode root){
        while(root.left!=null)
            root =root.left;
        return root;
    }
}
