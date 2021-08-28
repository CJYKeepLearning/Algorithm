import java.util.Scanner;

public class Sixth6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number：");
        long n = input.nextLong();
        int ans = sumDigits(n);
        System.out.println(ans);
    }
    public static int sumDigits(long n){
        int sum=0;
        while (n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
