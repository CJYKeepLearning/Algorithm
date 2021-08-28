public class Test {
    public static void main(String[] args) {
        Offer_37 t = new Offer_37();
        TreeNode r = new TreeNode(1);
        r.left = new TreeNode(2);
        r.right = new TreeNode(3);
        r.right.left = new TreeNode(4);
        r.right.right = new TreeNode(5);
        t.BFS(r);
    }
}
