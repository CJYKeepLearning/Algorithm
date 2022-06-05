import java.util.Scanner;

public class AcWing_1245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            if (isRight(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isRight(int i) {
        while (i != 0){
            int t = i % 10;
            if (t == 2 || t == 0 || t == 1 || t==9){
                return true;
            }
            i = i / 10;
        }
        return false;
    }
}
