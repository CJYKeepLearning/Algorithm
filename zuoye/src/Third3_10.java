import java.util.Scanner;

public class Third3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Generate two random integers less than 100.
        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);

        //prompt the student to answer the addition question
        System.out.println("what is "+num1+"+"+num2+"=?");
        int ans = input.nextInt();

        //display the answer
        if (ans==num1+num2)
            System.out.println("Your are correct!");
        else {
            System.out.println("Your answer is wrong");
            System.out.println(num1+"+"+num2+"is"+(num1+num2));
        }

    }
}
