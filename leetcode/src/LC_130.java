public class LC_130 {
    public static void solve(char[][] board){
        if (board.length==0)
            return;
        int m = board.length;
        int n = board[0].length;
        union_Find uf = new union_Find(m*n+1);
        int dummy = m*n;
        for (int i=0;i<m;i++){
            if (board[i][0]=='O')
                uf.union(i*n,dummy);
            if (board[i][n-1]=='O')
                uf.union(i*n+n-1,dummy);
        }
        for (int i=0;i<n;i++){
            if (board[0][i]=='O')
                uf.union(i,dummy);
            if (board[m-1][i]=='O')
                uf.union(n*(m-1)+i,dummy);
        }
        //d是方向数组
        int[][] d = new int[][]{{1,0},{0,1},{0,-1},{-1,0}};
        for (int i=1;i<m-1;i++){
            for (int j=1;j<n-1;j++){
                if (board[i][j]=='O'){
                    for (int k=0;k<4;k++){
                        int x = i+d[k][0];
                        int y = j+d[k][1];
                        if (board[x][y]=='O')
                            uf.union(x*n+7,i*n+j);
                    }
                }
            }
        }
        //替换
        for (int i=1;i<m-1;i++){
            for (int j=1;j<n-1;j++){
                if (!uf.connected(dummy,i*n+j))
                    board[i][j] = 'X';
            }
        }
    }
}
