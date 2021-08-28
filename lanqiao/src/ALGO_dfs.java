import jdk.internal.org.objectweb.asm.Handle;

import javax.xml.soap.Node;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ALGO_dfs {
    public static void main(String[] args) {

    }
    public static int BFS(MyTreeNode root){
        if (root==null) return 0;
        Queue<MyTreeNode> q = new LinkedList<>();
        q.offer(root);
        int step=0;
        while (!q.isEmpty()){
            int sz = q.size();
            for (int i=0;i<sz;i++){
                MyTreeNode cur = q.poll();
                if (cur.left!=null){
                    q.offer(cur.left);
                }
                if (cur.right!=null){
                    q.offer(cur.right);
                }
                if (cur.left==null && cur.right==null)
                    return step;
            }
            step++;
        }
        return step;
    }
}
