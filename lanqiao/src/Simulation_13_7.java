import java.util.Scanner;

public class Simulation_13_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double i = a * a, j = b * b, k = c * c;
        if (i + j == k || i + k == j || i == j + k){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
