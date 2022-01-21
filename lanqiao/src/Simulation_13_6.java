import java.util.Scanner;

public class Simulation_13_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int n = (t+11)/12*p;
        System.out.println(n);
    }
}
