import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ALGO_2019_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();
        //t1[t][n]:在t时刻，编号为n的商店的订单数为t1[t][n]
        int[][] t1 = new int[T+1][N+1];
        for (int i=1;i<=M;i++){
            int t = scanner.nextInt();
            int n = scanner.nextInt();
            t1[t][n] = t1[t][n]+1;
        }
        HashSet<Integer> pri = new HashSet();
        //t2[t][n]:在t时刻，编号为n的商店的优先级为t1[t][n]
        int[][] t2 = new int[T+1][N+1];
        for (int i=0;i<t1.length;i++){
            for (int j=1;j<t1[i].length;j++){
                if (t1[i][j]==0){
                    t2[i][j] = t2[i][j]-1;
                    if (t2[i][j]<0)
                        t2[i][j] = 0;
                }else {
                    if (i==0)
                        t2[i][j] = t1[i][j]*2;
                    t2[i][j] = t2[i-1][j]+t1[i][j]*2;
                }
                if (t2[i][j]>5)
                    pri.add(j);
                else if (t2[i][j]<=3 && pri.contains(j))
                    pri.remove(j);
            }
        }
        System.out.println(pri.size());
    }
}
