import java.util.Scanner;

public class ALGO_11 {
    //瓷砖摆放
    /*
        有一长度为N(1<=Ｎ<=10)的地板，给定两种不同瓷砖：一种长度为1，另一种长度为2，数目不限。要将这个长度为N的地板铺满，一共有多少种不同的铺法？
    　　例如，长度为4的地面一共有如下5种铺法：
    　　4=1+1+1+1
    　　4=2+1+1
    　　4=1+2+1
    　　4=1+1+2
    　　4=2+2
    　　编程用递归的方法求解上述问题。
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(recursion(N));

        //1 2 3 5 8
    }
    public static int recursion(int N){
        if (N==1) return 1;
        if (N==2) return 2;
        int ans = recursion(N-1)+recursion(N-2);
        return ans;
    }
}
