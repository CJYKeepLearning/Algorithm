public class offer_10_I {
    static final int MOD = 1000000007;
    //动态规划
    public int fib(int n) {
        if (n<2)
            return n;
        int a=0,b=1,c=0,i=2;
        while (i<=n){
            c = (a+b)%1000000007;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
    //矩阵快速幂
    public int fibMatrix(int n) {
        if (n<2)
            return n;
        int[][] q = {{1,1},{1,0}};
        int[][] res = pow(q,n-1);
        return res[0][0];
    }
    public int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    public int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = (int) (((long) a[i][0] * b[0][j] + (long) a[i][1] * b[1][j]) % MOD);
            }
        }
        return c;
    }
}
