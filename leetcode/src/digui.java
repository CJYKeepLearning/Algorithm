public class digui {
    public static void main(String[] args) {
        int m=3,n=2;
        System.out.println(f(m,n));
    }
    public static int f(int m,int n){
        if (m<n)
            return 0;
        if (m==1 && n==1)
            return 1;
        else
            return f(m-1,n)+f(m,n-1);
    }
}
