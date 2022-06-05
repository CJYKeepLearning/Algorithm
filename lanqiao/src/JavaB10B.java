public class JavaB10B {
    static long num = 0;
    static void dfs(int n,int begin){
        if (n<0) return;
        if (n == 0) num++;
        else {
            for (int i=begin;i*i<=n;i++){
                dfs(n-i*i,i+1);
            }
        }
    }
    public static void main(String[] args) {
        dfs(2019,1);
        System.out.println(num);
    }
}
