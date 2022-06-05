import java.util.Scanner;

public class CB09G {
    // 螺旋折线
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long sum = 0;
        if((y<x)&&(-y<=x))
        {
            sum+=x>1?(long)(4*(2+(Math.abs(x)-1)*(Math.abs(x)-2))):0;
            sum+=(long)x>0?(4*x+(x-y)):(y-x);
        }
        else
        {
            sum+=y>1?(long)(4*(2+(Math.abs(y)-1)*(Math.abs(y)-2))):0;
            sum+=(long)y>0?(2*y+y+x):(6*y-y-x);
        }
        System.out.println(sum);
    }
}
