import java.util.Scanner;

public class ALGO_16 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,k,max;
        String s;
        n = in.nextInt();
        k = in.nextInt();
        s = in.next();
        max = rec(1,k,s);
        System.out.println(max);
    }

    public static int rec(int temp,int k,String s)
    {
        int max = 0;
        if(k == 0)
            return Integer.parseInt(s.substring(temp-1, s.length()));
        else
        {
            for(int i=temp;i<=s.length()-k;i++)
            {
                int num =  Integer.parseInt(s.substring(temp-1, i)) * rec(i+1,k-1,s);
                if(num > max)
                    max = num;
            }
        }
        return max;
    }
}
