import java.util.*;

public class CA12G {
    // 冰山
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        Queue<Long> ice = new LinkedList();
        for (int i=0;i<n;i++){
            ice.add(sc.nextLong());
        }
        for (int i=0;i<m;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long sum = y;
            if (x != 0){
                int sz = ice.size();
                for (int s = 0;s<sz;s++){
                    long temp = ice.poll() + x;
                    if (temp > 0){
                        sum+= temp;
                        if (temp > k){
                            ice.add(k);
                            for (int l = 0;l<temp - k;l++){
                                ice.add(1l);
                            }
                        }else{
                            ice.add(temp);
                        }
                    }
                }
            }
            if (y != 0) {// 判断有没有新冰山
                ice.add(y);
            }
            System.out.println(sum % 998244353l);
        }
    }
}
