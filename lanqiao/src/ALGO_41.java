import java.util.Scanner;

public class ALGO_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] arr = new int[M][N];
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        for (int x1=0;x1<=M-K;x1++){
            for (int y1=0;y1<=N-K;y1++){
             for (int x2=0;x2<=M-K;x2++){
                 for (int y2=0;y2<=N-K;y2++){
                     for (int x3=0;x3<=M-K;x3++){
                         for (int y3=0;y3<=N-K;y3++){
                             int[][] narr = deepCopy(arr);
                             int A = sum(x1,y1,K,narr);
                             int B = sum(x2,y2,K,narr);
                             int C = sum(x3,y3,K,narr);
                             if (A+B+C==1826)
                                 System.out.println("x1:"+x1+" y1:"+y1+" x2:"+x2+" y2:"+y2+" x3:"+x3+" y3:"+y3);
                             max = Math.max(max,A+B+C);

                         }
                     }
                 }
             }
            }
        }
        System.out.println(max);
    }
    public static int sum(int x1,int y1,int k,int[][] arr){
        int sum=0;
        for (int i=x1;i<x1+k;i++){
            for (int j=y1;j<y1+k;j++){
                if(arr[i][j]==0)
                    return 0;
                sum += arr[i][j];
                arr[i][j] = 0;
            }
        }
        return sum;
    }
    public static int[][] deepCopy(int[][] b){
        int[][] newArr = new int[b.length][b[0].length];
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[0].length;j++)
                newArr[i][j] = b[i][j];
        }
        return newArr;
    }
}
