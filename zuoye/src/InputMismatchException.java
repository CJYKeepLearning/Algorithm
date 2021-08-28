import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Please enter two integers:");
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                System.out.println("The sum is :"+(n1+n2));
                continueInput = false;
            }catch (java.util.InputMismatchException exception){
                System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                scanner.nextLine();
            }
        }while (continueInput);
    }
}
