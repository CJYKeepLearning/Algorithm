import java.util.Scanner;

public class seventh7_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Please enter ten double values");
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextDouble();
        }
        System.out.println("The smallest element in array is:"+min(array));
    }
    public static double min(double[] array){
        double minNum = array[0];
        for (double d:array){
            minNum = Math.min(minNum,d);
        }
        return minNum;
    }
}
