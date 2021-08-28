import java.math.BigInteger;
import java.util.Scanner;

public class ALGO_麦森数2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        BigInteger two,f,m;
        two = BigInteger.ONE.add(BigInteger.ONE);//得到BigInteger形式的2
        m = BigInteger.TEN.pow(500);//得到10^500
        f = two.modPow(BigInteger.valueOf(P),m);//得到后500位数。two^P mod m
        System.out.println((int)(Math.floor(P*Math.log10(2))+1));//计算位数
        String s = f.toString();
        int i;
        for (i=1;i<=500-s.length();i++) {
            System.out.print("0");
            if (i % 50 == 0)
                System.out.println();
        }
        for (i=500-s.length()+1;i<500;i++){
            System.out.print(s.charAt(i-500+s.length()-1));
            if (i%50==0)
                System.out.println();
        }
        System.out.print(s.charAt(s.length()-1)-'0'-1);
    }
}
