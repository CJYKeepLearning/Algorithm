public class LC_100 {
    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode q1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));

        TreeNode p2 = new TreeNode(1,new TreeNode(2),null);
        TreeNode q2 = new TreeNode(1,null,new TreeNode(2));

        TreeNode p3 = new TreeNode(1,new TreeNode(2),new TreeNode(1));
        TreeNode q3 = new TreeNode(1,new TreeNode(1),new TreeNode(2));

        System.out.println(isSameTree(p1,q1));
        System.out.println(isSameTree(p2,q2));
        System.out.println(isSameTree(p3,q3));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            if(p==null && q==null)
                return true;
            else
                return false;
        }
        if(p.val==q.val)
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        else
            return false;
    }
}
