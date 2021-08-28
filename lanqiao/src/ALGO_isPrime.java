import java.lang.reflect.Array;
import java.util.Arrays;

public class ALGO_isPrime {
    public static void main(String[] args) {

    }
    public static int countPrimes(int n){
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        for (int i=2;i<n;i++){
            if (isPrime[i])
                for (int j=2*i;j<n;j+=i)
                    isPrime[j] = false;
        }
        int count = 0;
        for (int i=2;i<n;i++)
            if (isPrime[i])
                count++;
            return count;
    }
}
