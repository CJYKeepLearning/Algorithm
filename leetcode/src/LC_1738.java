import java.util.*;
public class LC_1738 {
    /*
    //二位前缀和
    给你一个二维矩阵 matrix 和一个整数 k ，矩阵大小为 m x n 由非负整数组成。
    矩阵中坐标 (a, b) 的 值 可由对所有满足 0 <= i <= a < m 且 0 <= j <= b < n 的元素 matrix[i][j]（下标从 0 开始计数）执行异或运算得到。
    请你找出 matrix 的所有坐标中第 k 大的值（k 的值从 1 开始计数）。
    示例 1：
    输入：matrix = [[5,2],[1,6]], k = 1
    输出：7
    解释：坐标 (0,1) 的值是 5 XOR 2 = 7 ，为最大的值。
    * */
    public static void main(String[] args) {
        System.out.println();
    }
    public int kthLargestValue(int[][] matrix, int k) {
        List<Integer> results = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] xorValue = new int[matrix.length][matrix[0].length];
        xorValue[0][0] = matrix[0][0];
        results.add(xorValue[0][0]);

        //row
        for (int i=1;i<xorValue[0].length;i++){
            xorValue[0][i] = xorValue[0][i-1]^matrix[0][i];
            results.add(xorValue[0][i]);
        }

        //column
        for (int i=1;i<xorValue.length;i++){
            xorValue[i][0] = xorValue[i-1][0]^matrix[i][0];
            results.add(xorValue[i][0]);
        }


        for (int i=1;i<xorValue.length;i++){
            for (int j=1;j<xorValue[i].length;j++){
                xorValue[i][j] = xorValue[i-1][j-1]^xorRowCol(matrix,i,j);
                results.add(xorValue[i][j]);
            }
        }

        Collections.sort(results, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        return results.get(k - 1);

    }
    public int xorRowCol(int[][] matrix, int i,int j){
        int res=0;
        for (int m=0;m<j;m++){
            res = res^matrix[i][m];
        }
        for (int m=0;m<i;m++){
            res = res^matrix[m][j];
        }
        res = res ^ matrix[i][j];
        return res;
    }
}
