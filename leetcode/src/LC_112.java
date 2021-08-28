import java.util.LinkedList;
import java.util.List;

public class LC_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root!=null)
            return dfs(root,new LinkedList(),root.val,targetSum);
        else
            return false;
    }
    public boolean dfs(TreeNode root,LinkedList track,int sum,int target){
        //结束条件
        if (root.left==null && root.right==null && sum==target)
            return true;

        if (root.left!=null){
            track.add(root.left);
            if(dfs(root.left,track,sum+root.left.val,target))
                return true;
            track.removeLast();
        }
        if (root.right!=null){
            track.add(root.right);
            if (dfs(root.right,track,sum+root.right.val,target))
                return true;
            track.removeLast();
        }
        return false;
    }
}
