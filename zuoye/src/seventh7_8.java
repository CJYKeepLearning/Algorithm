import javax.management.openmbean.SimpleType;
import java.util.Scanner;

public class seventh7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arrDouble = new double[10];
        System.out.println("Please enter ten double values");
        for (int i=0;i<arrDouble.length;i++){
            arrDouble[i] = scanner.nextDouble();
        }

        double aveArrDouble = average(arrDouble);

        System.out.println("The average of arrDouble is:"+aveArrDouble);

    }
    public static int average(int[] array){
        int sum=0;
        for (int i:array){
            sum += i;
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        double sum = 0.0;
        for (double i:array){
            sum += i;
        }
        return sum/array.length;
    }
}
