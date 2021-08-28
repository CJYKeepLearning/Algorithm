import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LC_752 {
    public int openLock(String[] deadends, String target) {
        return BFS(deadends,target);
    }
    public int  BFS(String[] deadends, String target){
        Queue<String> queue= new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        HashSet<String> dead = new HashSet<>();
        visited.add("0000");
        for (int i=0;i<deadends.length;i++){
            dead.add(deadends[i]);
        }
        int dep=0;
        queue.offer("0000");
        while (!queue.isEmpty()){
            int sz = queue.size();
            for (int k=0;k<sz;k++){
                String node = queue.poll();
                if (dead.contains(node))
                    continue;
                if (node.equals(target)){
                    return dep;
                }
                for (int i=0;i<4;i++){
                    String up = plusOne(node,i);
                    if(!visited.contains(up)){
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(node,i);
                    if(!visited.contains(down)){
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            dep++;
        }
        return -1;
    }
    public String plusOne(String s,int j){
        char[] ch = s.toCharArray();
        if(ch[j]=='9')
            ch[j]='0';
        else
            ch[j]+=1;
        return new String(ch);
    }
    public String minusOne(String s,int j){
        char[] ch = s.toCharArray();
        if(ch[j]=='0')
            ch[j]='9';
        else
            ch[j]-=1;
        return new String(ch);
    }
}
