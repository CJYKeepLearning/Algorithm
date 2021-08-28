import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput=true;
        do {
            try{
                System.out.println("请输入三角形的三条边：");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1,side2,side3);
                System.out.println(triangle);
                continueInput = false;
            }catch (IllegalTringleException ex){
                System.out.println("Your input is invalid");
                scanner.nextLine();
            }
        }while (continueInput);


    }
}
