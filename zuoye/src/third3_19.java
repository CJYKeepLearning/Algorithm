import java.util.Scanner;

public class third3_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the three sides of the triangle ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a+b>c&&a+c>b&&b+c>a)
            System.out.println("The perimeter of the triangle is:"+(a+b+c));
        else
            System.out.println("Your enter is invaild");
    }
}
