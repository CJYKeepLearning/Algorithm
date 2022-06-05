public class CB12D {
    public static void main(String[] args) {
        long[] dp = new long[2022];
        dp[0] = 0;
        for (int i=1;i<=2021;i++){
            dp[i] = Long.MAX_VALUE;
        }
        for (int i=1;i<=2021;i++){
            for (int j=0;j<i;j++){
                dp[i] = Math.min(dp[i],1+2*dp[j]+3*dp[i-j-1]+j*j*(i-j-1));
            }
        }
        System.out.println(dp[2021]);
    }
}
