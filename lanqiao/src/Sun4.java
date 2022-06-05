import java.util.Scanner;

public class Sun4 {
    static int[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        num = new int[n+1];
        String s = sc.next();
        char[] c = s.toCharArray();
        for (int i=1;i<=n;i++){
            if (c[i-1] == '(') num[i] = 1;
            else num[i] = -1;
        }
        for (int i = 0;i<m;i++){
            int x = sc.nextInt();
            if (x == 2){
                int r = sc.nextInt();
                System.out.println(right(r));
            }else {
                int l = sc.nextInt();
                int r = sc.nextInt();
                reverse(l,r);
            }
        }
    }

    private static void reverse(int l, int r) {
        for (int i=l;i<=r;i++){
            num[i] = -num[i];
        }
    }

    static int right(int left){
        int sum = num[left];
        while ( sum >= 0 ){
            left++;
            if (left == num.length) break;
            sum += num[left];
        }
        return left-1;
    }
}
