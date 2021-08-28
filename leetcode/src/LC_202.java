import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LC_202 {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true){
            int sum=0;
            ArrayList<Integer> num = new ArrayList<>();
            while (n>=10){
                num.add(n%10);
                n = n/10;
            }
            num.add(n);
            for (int item:num){
                sum+=item*item;
            }
            if (sum==1)
                return true;
            if (!set.contains(sum))
                set.add(sum);
            else
                return false;
            n = sum;
        }

    }

    public static void main(String[] args) {
        int n = 7;
        if(isHappy(n))
            System.out.println("happy");
        else
            System.out.println("unhappy");
    }
}
