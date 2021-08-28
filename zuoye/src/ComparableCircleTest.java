import java.util.Scanner;

public class ComparableCircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first circle's radius");
        ComparableCircle circle1 = new ComparableCircle(scanner.nextDouble());
        System.out.println("please enter the second circle's radius");
        ComparableCircle circle2 = new ComparableCircle(scanner.nextDouble());

        int res = circle1.compareTo(circle2);
        if (res>0){
            System.out.println("The bigger one is the first");
        }else if (res==0){
            System.out.println("They have same area");
        }else {
            System.out.println("The bigger one is the second");
        }

    }
}