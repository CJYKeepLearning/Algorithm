import java.util.Scanner;

public class ALGO_41b {
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
                for (int x2=x1;x2<=M-K;x2++){
                    for (int y2=(x2>=(x1+K)?0:y1+K);y2<=N-K;y2++){
                        for (int x3=x2;x3<=M-K;x3++){
                            for (int y3=(x3>=(x2+K)?0:y2+K);y3<=N-K;y3++){
                                int A = sum(x1,y1,K,arr);
                                int B = sum(x2,y2,K,arr);
                                int C = sum(x3,y3,K,arr);
                                if (A+B+C==1821)
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
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
