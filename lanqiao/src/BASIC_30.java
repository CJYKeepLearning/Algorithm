import java.util.LinkedList;
import java.util.Scanner;

public class BASIC_30 {
    public static void main(String[] args) {
        int[] a = new int[10005];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a[0] = 1;
        int s,c=0;
        for (int i=2;i<=n;i++){
            for (int j=0;j<10000;j++){
                s = a[j]*i+c;
                a[j] = s%10;
                c = s/10;
            }
        }
        for (int i=10000;i>=0;i--){
            if (a[i]!=0){
                for (int j=i;j>=0;j--){
                    System.out.print(a[j]);
                }
                break;
            }
        }
    }
}
