import java.util.Scanner;

public class ALGO_23 {
    public static double a,b,c,d;
    public static void main(String[] args) {
        //精度不行
        //测试用例：1 -4.65 2.25 1.4
        //答案：-0.35 1.00 5.00，第二个程序输出0.99
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        for (int i=-100;i<=100;i++){
            if (check(i*1.0)*check((i+1)*1.0)<0){
                double low = i*1.0,high = (i+1)*1.0;
                double mid=0.0;
                while (high-low>1e-7){
                    mid = (high+low)/2;
                    if (check(mid)*check(high)<=0)
                        low = mid;
                    else if (check(mid)*check(high)==0){
                    }else
                        high = mid;
                }
                System.out.print(((int)(mid*100))/100.0+" ");
            }
            if (check(i*1.0)==0)
                System.out.printf("%.2f ",i*1.0);
        }
    }
    public static double check(double x)
    {
        return a*x*x*x + b*x*x + c*x + d;
    }
    public static double check(int x){
        return a*x*x*x + b*x*x + c*x + d;
    }
}
