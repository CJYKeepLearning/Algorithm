import java.math.BigInteger;
import java.util.Scanner;


public class ALGO_麦森数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int p,len,i,cnt;
        String s;
        p=scanner.nextInt();
        BigInteger two,f,m;

        two=BigInteger.ONE.add(BigInteger.ONE);
        m=BigInteger.TEN.pow(500);//10^500
        f=two.modPow(BigInteger.valueOf(p), m);
        f=f.subtract(BigInteger.ONE);
        if(f.compareTo(BigInteger.ZERO)<0)
            f=f.add(m);
        s=f.toString();
        len=s.length();
        cnt=0;
        System.out.println((int)(Math.floor(p*Math.log10(2))+1));

        //输出高位零
        for(i=1;i<=500-len;i++)
        {
            System.out.print('0');
            cnt++;
            if(cnt==50)
            {
                cnt=0;
                System.out.println();;
            }
        }
        //输出其他位
        for(i=0;i<len;i++)
        {
            System.out.print(s.charAt(i));
            cnt++;
            if(cnt==50)
            {
                cnt=0;
                System.out.println();
            }
        }
    }




}

