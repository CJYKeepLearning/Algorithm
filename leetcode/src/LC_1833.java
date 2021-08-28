import java.util.Arrays;

public class LC_1833 {
    public static void main(String[] args) {
        int[] costs={1,3,2,4,1};
        int coins = 7;
        maxIceCream(costs,coins);
    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0,i=0;
        for (i=0;i<costs.length;i++){
            sum+=costs[i];
            if (sum>coins)
                break;
        }
        return i;
    }
}
