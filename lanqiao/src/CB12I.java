import java.util.Scanner;

public class CB12I {
    //翻转括号序列
    static int[] num;
    static int[] pre;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        num = new int[n+1];
        pre = new int[n+1];
        String s = sc.next();
        char[] chars = s.toCharArray();
        for (int i=1;i<=s.length();i++){
            if (chars[i-1] == '('){
                num[i] = 1;
            }else num[i] = -1;
        }
        for (int i=1;i<=n;i++){
            pre[i] = pre[i-1] + num[i];
        }
        for (int i=0;i<m;i++){
            int op = sc.nextInt();
            if (op == 1){
                int l = sc.nextInt();
                int r = sc.nextInt();
                reverse(l,r);
            }else {
                int l = sc.nextInt();
                int r = check(l);
                System.out.println(r);
            }
        }
    }

    private static int check(int l) {
        if(pre[l] - pre[l-1] < 0) return 0;
        int max = 0;
        int r = l+1;
        while (r<pre.length){
            int sum = pre[r] - pre[l-1];
            if (sum == 0) max = Math.max(max,r);
            else if (sum < 0) return max;
            r++;
        }
        return max;
    }

    private static void reverse(int l, int r) {
        int s = pre[r]-pre[l-1];
        for (int i=l;i<=r;i++){
            int sum = pre[i] - pre[l-1];
            pre[i] = pre[l-1] - sum;
        }
        for (int i=r+1;i<pre.length;i++){
            pre[i] -= 2*s;
        }
    }
}
