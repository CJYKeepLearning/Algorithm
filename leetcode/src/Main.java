public class Main {
    //calculate Complete Binary Tree Nodes
    public static void main(String[] args) {

    }
    public static int counts(TreeNode root){
        //a Complete Tree has a perfect Binary tree
        TreeNode l = root;
        TreeNode r = root;
        int lh = 0,rh=0;
        while (l!=null){
            l = l.left;
            lh++;
        }
        while (r!=null){
            r = r.right;
            rh++;
        }
        if (lh==rh)
            return (int)Math.pow(2,lh)-1;
        return 1+counts(root.left)+counts(root.right);
    }
}
