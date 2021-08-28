import java.util.Scanner;

public class ALGO_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] res =new int[n];
        for (int i=0;i<n;i++){
            int a0 = scanner.nextInt();
            int a1 = scanner.nextInt();
            int b0 = scanner.nextInt();
            int b1 = scanner.nextInt();
            res[i] = solve(a0,a1,b0,b1);
        }
        for (int i:res){
            System.out.println(i);
        }
    }
    public static int solve(int a0,int a1,int b0,int b1){
        int cnt=0;
        for (int i=a1;i<=b1;i++){
            if (max(i,a0)==a1 && min(i,b0)==b1)
                cnt++;
        }
        return cnt;
    }
    public static int max(int a,int b){
        if (b==0) return a;
        return max(b,a%b);
    }
    public static int min(int a,int b){
        int i=Math.max(a,b);
        while (i<a*b){
            if (i%a==0 && i%b==0)
                return i;
            i++;
        }
        return a*b;
    }
}
