import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Offer_37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null)
            return null;
        return null;
    }
    public void BFS(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder s = new StringBuilder();
        q.offer(root);
        while (!q.isEmpty()){
                TreeNode t = q.poll();
                s.append(t.val);
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
        }
        System.out.println(s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode treeNode = new TreeNode(1);
        return treeNode;
    }
}
