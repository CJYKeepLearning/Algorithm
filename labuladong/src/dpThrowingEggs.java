import java.util.Arrays;

public class dpThrowingEggs {
    //最坏情况下，至少扔几次？
    //最坏情况：搜索区间穷尽时
    //至少扔几次？：最少的次数
    private static int[][] memo;
    public static int superEggDrop(int K,int N){
        memo = new int[K+1][N+1];
        for (int[] me:memo)
            Arrays.fill(me,Integer.MIN_VALUE);
        int ans = dp(K,N);
        return ans;
    }
    public static int dp(int K,int N){
        if (N==0)
            return 0;
        if (K==1)
            return N;
        if(memo[K][N]!=Integer.MIN_VALUE)
            return memo[K][N];

        int res = Integer.MAX_VALUE;
        //对于第一次K=3，N=1000来说，第一次仍的时候，可以有从1-10000种扔的策略。所以从1-1000循环。求最佳策略，所以是min,求最坏情况，即每次策略中最坏的时候即max
        for (int i=1;i<=N;i++){
            res =  Math.min(res,Math.max(dp(K-1,i-1),dp(K,N-i))+1);
        }
        memo[K][N] = res;
        return res;
    }

    public static void main(String[] args) {
        int K=3,N=1000;
        int ans = superEggDrop(K,N);
        System.out.println(ans);
    }
}
