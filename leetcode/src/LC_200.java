public class LC_200 {
    int max = Integer.MIN_VALUE;
    int res = 0;
    int maxAreaOfIsland(int[][] grid){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    dfs(grid,i,j);
                    max = max > res ? max : res;
                    res = 0;
                }
            }
        }
        return max;
    }

    private void dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n){
            return;
        }
        if (grid[i][j] == 0){
            return;
        }
        res += 1;
        grid[i][j] = 0;
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
    }
}
