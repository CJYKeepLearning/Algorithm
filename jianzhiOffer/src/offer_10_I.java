public class offer_10_I {
    public int fib(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        int a=0,b=1,c=0,i=2;
        while (i<=n){
            c = (a+b)%1000000007;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
}
