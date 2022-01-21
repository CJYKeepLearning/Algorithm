public class LC_304 {
}
class NumMatrix {
    private int num[][];

    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if (m == 0 || n == 0) return;
        num = new int[m+1][n+1];
        for (int i=0;i<=m;i++){
            for (int j=0;j<=n;j++){
                num[i][j] = num[i-1][j]+num[i][j-1]+matrix[i-1][j-1]-num[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return num[row2+1][col2+1]-num[row1][col2+1]-num[row2+1][col1]+num[row1][col1];
    }
}