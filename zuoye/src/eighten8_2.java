import java.util.Scanner;

public class eighten8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 4-by-4 matrix");
        double[][] arr = new double[4][4];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++)
                arr[i][j] = scanner.nextDouble();
        }
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0.0;
        for (int i=0;i<m.length;i++){
            sum += m[i][i];
        }
        return sum;
    }
}
