import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LC_652 {
    HashMap<String,Integer> memo = new HashMap<>();
    LinkedList<TreeNode> res = new LinkedList<>();
    List<TreeNode> findDuplicateSubtrees(TreeNode root){
        traverse(root);
        return res;
    }
    //序列化二叉树
    String traverse(TreeNode root){
        if (root==null)
            return "#";
        String left = traverse(root.left);
        String right = traverse(root.right);
        String subTree = left+","+right+","+root.val;

        int freq = memo.getOrDefault(subTree,0);
        if (freq==1)
            res.add(root);
        memo.put(subTree,freq+1);
        return subTree;
    }

}
