import java.util.Scanner;

public class third3_22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter a point(x,y): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        //Check the point
        if((a*a+b*b)<=100)
            System.out.println("The point"+"("+a+","+b+")"+"is in the circle");
        else
            System.out.println("The point"+"("+a+","+b+")"+"is not in the circle");
    }
}
