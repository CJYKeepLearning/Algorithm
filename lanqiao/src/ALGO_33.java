import java.util.Scanner;

public class ALGO_33 {
    //给定一个正整数k(3≤k≤15),把所有k的方幂及所有有限个互不相等的k的方幂之和构成一个递增的序列，例如，当k=3时，这个序列是：
    //　　1，3，4，9，10，12，13，…
    //　　（该序列实际上就是：3^0，3^1，3^0+3^1，3^2，3^0+3^2，3^1+3^2，3^0+3^1+3^2，…）
    //　　请你求出这个序列的第N项的值（用10进制数表示）。
    //　　例如，对于k=3，N=100，正确答案应该是981。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  k = scanner.nextInt();
        int N = scanner.nextInt();
        int ans = 0;
        int base = 1;
        String str = Integer.toString(N,2);
        char[] sNum = str.toCharArray();
        for (int i=sNum.length-1;i>=0;i--){
            if (sNum[i]=='1')
                ans += base;
            base *= k;
        }
        System.out.println(ans);
    }
}
