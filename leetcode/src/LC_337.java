import java.util.Map;

public class LC_337 {
    static class TrreNdoe{
        int val;
        TrreNdoe left;
        TrreNdoe right;

        public TrreNdoe(int val) {
            this.val = val;
        }
    }
    static Map<TrreNdoe,Integer> treeMap;
    public static int rob(TreeNode root) {
        if (root == null ) return 0;
        if (root.left==null && root.right == null) return root.val;
        if (treeMap.get(root)!=null) return treeMap.get(root);
        //steal parents
        int res1 = root.val;
        if (root.left!=null) res1 += rob(root.left.left)+rob(root.left.right);
        if (root.right!=null) res1 += rob(root.right.left)+rob(root.right.right);

        //dont steal parents
        int res2 = 0;
        res2 = rob(root.left) + rob(root.right);

        return Math.max(res1,res2);
    }

    public static void main(String[] args) {

    }
}
