import java.util.Arrays;
import java.util.Scanner;

public class ALGO_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceSumMax = scanner.nextInt();
        int n = scanner.nextInt();
        int[] price = new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            price[i] = scanner.nextInt();
            sum += price[i];
        }
        Arrays.sort(price);
        int ans = 0;
        int i=0,j = price.length-1;
        while (i<=j){
            if (price[i]+price[j]>priceSumMax){
                j--;
            }else {
                i++;j--;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
