import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WRData {
    public static final int N = 100;
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Exercise12_15.txt");
        PrintWriter sFile = new PrintWriter(file);

        for (int i=1;i<=N;i++){
            Random random = new Random();
            int n = random.nextInt(N);
            sFile.print(n);
            sFile.print(" ");
        }
        sFile.close();  //一定要记得关闭！

        Scanner input = new Scanner(file);
        int[] x = new int[N];
        int i=0;
        while (input.hasNext()){
            x[i] = input.nextInt();
            i++;
        }
        input.close();

        Arrays.sort(x);
        for (int n:x
             ) {
            System.out.print(n+" ");
        }
    }
}
