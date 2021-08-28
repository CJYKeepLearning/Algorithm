import javax.swing.plaf.IconUIResource;

public class UF {
    private int cnt;
    private int[] parent;
    private int[] size;
    public UF(int n){
        size = new int[n];
        this.cnt = n;
        parent = new int[n];
        for (int i=0;i<n;i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    public void union(int p,int q){
        int rootP = find(p);
        int rootQ = find(q);
        if (size[rootP]>size[rootQ]){
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        parent[rootP] = rootQ;
        cnt--;
    }
    public int find(int p){
        while (parent[p]!=p){
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }
}
