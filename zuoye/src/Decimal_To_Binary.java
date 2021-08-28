import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal integer");
        String s = "";
        int n = input.nextInt();
        while (n>0){
            s = (n%2)+s;
            n = n/2;
        }
        System.out.println(s);
    }
}
