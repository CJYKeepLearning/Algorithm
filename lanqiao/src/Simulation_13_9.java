import java.util.Scanner;

public class Simulation_13_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] f = new double[1010];
        for (int i=1;i<=n;i++){
            f[0] = 1;
            f[i] = 1;
            for (int j=i-1;j>0;j--){
                f[j] = (f[j-1]+f[j])%(1e9+7);
            }
        }
        System.out.println((int)f[n/2]);
    }
}
