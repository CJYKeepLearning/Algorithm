import javax.naming.LinkLoopException;
import java.util.LinkedList;
import java.util.Queue;

public class LC_993 {
    int xpar,xdep,ypar,ydep;
    public boolean isCousins(TreeNode root, int x, int y) {
        return false;
    }
    public void dfs(TreeNode node,int x,int y,int dep,int par){
        if (node==null){
            return;
        }
        if (node.val==x){
            xpar = par;
            xdep = dep;
        }else if (node.val==y){
            ypar = par;
            ydep = dep;
        }else {
            dfs(node.left,x,y,dep+1,node.left.val);
            dfs(node.right,x,y,dep+1,node.right.val);
        }
    }
}
