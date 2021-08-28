import java.util.Scanner;

public class Third3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the student to enter number
        System.out.print("Enter a three-digit integer:");
        int num = input.nextInt();

        //check the number legitimacy
        while (num<100 || num>999){
            System.out.println("number is wrong,please input again");
            num = input.nextInt();
        }

        //get ones place and hundreds place
        int onesPlace = num%10;
        int hundredsPlace = num/100;

        //display the answer
        System.out.println(onesPlace==hundredsPlace? num+" is a palindrome":num+" is not a palindrome");
    }
}
