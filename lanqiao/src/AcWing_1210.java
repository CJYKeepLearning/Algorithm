import java.util.Arrays;
import java.util.Scanner;

public class AcWing_1210 {
    // 连号区间数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n+1];
        for (int i=1;i<=n;i++){
            num[i] = sc.nextInt();
        }
        int res = 0;

        for (int i=1;i<=n;i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j=i;j<=n;j++){
                max = Math.max(max,num[j]);
                min = Math.min(min,num[j]);
                if(max - min == j-i){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
