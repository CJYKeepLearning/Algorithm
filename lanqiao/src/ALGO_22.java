import java.util.Scanner;

public class ALGO_22 {
    public static int count = 0;
    //数的划分
    //将整数n分成k份，且每份不能为空，任意两份不能相同(不考虑顺序)。
    //　　例如：n=7，k=3，下面三种分法被认为是相同的。
    //　　1，1，5; 1，5，1; 5，1，1;
    //　　问有多少种不同的分法。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        backtrack(1,n,k);
        System.out.println(count);
    }
    //使用的回溯
    public static void backtrack(int i,int n,int k){
        if (n==1 && k>1){
            return;
        }
        if (k==1){
            count++;
            return;
        }
        for (int j=i;j<=n/k;j++){
         backtrack(j,n-j,k-1);
        }
    }
}
