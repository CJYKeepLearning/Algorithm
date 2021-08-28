import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f:");
        double[] algs = new double[6];
        for (int i=0;i<algs.length;i++){
            algs[i] = scanner.nextDouble();
        }
        LinearEquation le = new LinearEquation(algs[0],algs[1],algs[2],algs[3],algs[4],algs[5]);
        if (le.isSolvable()){
            double x = le.getX();
            double y = le.getY();
            System.out.println("x is "+x+" and y is:"+y);
        }else {
            System.out.println("The equation has no solution");
        }
    }
}
