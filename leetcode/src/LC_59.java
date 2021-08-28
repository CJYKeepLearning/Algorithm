/*myself*/
public class LC_59 {
    public static int[][] generateMatrix(int n) {
        /*有问题:
        * n=3超时？*/
        /*int[][] arr = new int[n][n];
        int start=0;
        int count = 1;
        int i=0,j=0;
        while (count<=n*n){
            for (j = start;j<n-start-1;j++)
                arr[i][j] = count++;
            for (i = start;i<n-start-1;i++)
                arr[i][j] = count++;
            for (;j>start;j--)
                arr[i][j] = count++;
            for (;i>start;i--)
                arr[i][j] = count++;
            start++;
            i=start;
        }
        return arr;*/
        int[][] arr = new int[n][n];
        int start=0;
        int count = 1;
        int i=0,j=0;
        while (count<=n*n){
            for (j = start;j<n-start;j++)
                arr[i][j] = count++;
            j--;
            for (i = start+1;i<n-start;i++)
                arr[i][j] = count++;
            i--;
            for (j--;j>=start;j--)
                arr[i][j] = count++;
            j++;
            for (i--;i>start;i--)
                arr[i][j] = count++;
            i++;
            start++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] a = generateMatrix(3);
        for (int i=0;i<6;i++){
            for (int j = 0;j<6;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }

    }
}
/*代码随想录*/
/*
class LC_59{
    public static int[][] generateMatrix(int n){
        int[][] res = new int[n][n];
        int startx = 0, starty = 0; // 定义每循环一个圈的起始位置
        int loop = n / 2; // 每个圈循环几次，例如n为奇数3，那么loop = 1 只是循环一圈，矩阵中间的值需要单独处理
        int mid = n / 2; // 矩阵中间的位置，例如：n为3， 中间的位置就是(1，1)，n为5，中间位置为(2, 2)
        int count = 1; // 用来给矩阵中每一个空格赋值
        int offset = 1; // 每一圈循环，需要控制每一条边遍历的长度
        int i,j;
        while (loop -- !=0) {
            i = startx;
            j = starty;

            // 下面开始的四个for就是模拟转了一圈
            // 模拟填充上行从左到右(左闭右开)
            for (j = starty; j < starty + n - offset; j++) {
                res[startx][j] = count++;
            }
            // 模拟填充右列从上到下(左闭右开)
            for (i = startx; i < startx + n - offset; i++) {
                res[i][j] = count++;
            }
            // 模拟填充下行从右到左(左闭右开)
            for (; j > starty; j--) {
                res[i][j] = count++;
            }
            // 模拟填充左列从下到上(左闭右开)
            for (; i > startx; i--) {
                res[i][j] = count++;
            }

            // 第二圈开始的时候，起始位置要各自加1， 例如：第一圈起始位置是(0, 0)，第二圈起始位置是(1, 1)
            startx++;
            starty++;

            // offset 控制每一圈里每一条边遍历的长度
            offset += 2;
        }

            // 如果n为奇数的话，需要单独给矩阵最中间的位置赋值
            if (n % 2 ==1) {
                res[mid][mid] = count;
            }
            return res;
    }

    public static void main(String[] args) {
        int[][] a = generateMatrix(6);
        for (int i=0;i<6;i++){
            for (int j = 0;j<6;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }

    }
}*/
