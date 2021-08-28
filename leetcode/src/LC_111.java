import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LC_111 {
/*
    给定一个二叉树，找出其最小深度。
    最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
    说明：叶子节点是指没有子节点的节点。
    示例 1：
    输入：root = [3,9,20,null,null,15,7]
    输出：2
    示例 2：
    输入：root = [2,null,3,null,4,null,5,null,6]
    输出：5
*/

    public int minDepth(TreeNode root) {
        return 0;
    }

    public int bfs(TreeNode root){
        if (root==null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int dep=1;
        q.offer(root);
        while (!q.isEmpty()){
            int sz = q.size();
            for (int i=0;i<sz;i++){
                TreeNode cur = q.poll();
            }
        }
        return 0;
    }
}
