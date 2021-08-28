import java.util.Scanner;

public class ALGO_158 {
    private static final double  eps= 1e-6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (Math.abs(num)<=eps){
            num = 0;
        }
        if (num>0)
            System.out.println(1);
        else if (num == 0)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}
