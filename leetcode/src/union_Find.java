public class union_Find {
    private int count;
    private int[] size;
    private int[] parsent;

    public union_Find(){}
    public union_Find(int n){
        this.count = n;
        parsent = new int[n];
        size = new int[n];
        for (int i=0;i<n;i++){
            parsent[i] = i;
            size[i] = 1;
        }
    }
    public void union(int p,int q){
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP==rootQ)
            return;
        //小树接到大树下面
        if (size[rootP]>=size[rootQ]){
            parsent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        else {
            parsent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }
    public boolean connected(int p,int q){
        return find(p)==find(q);
    }
    public int find(int x){
        while (parsent[x]!=x){
            //路径压缩
            parsent[x] = parsent[parsent[x]];
            x = parsent[x];
        }
        return x;
    }
}
