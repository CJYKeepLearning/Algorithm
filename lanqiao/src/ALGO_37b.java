import java.util.Scanner;

public class ALGO_37b {
    //Hanks 博士是BT (Bio-Tech，生物技术) 领域的知名专家，他的儿子名叫Hankson。现 在，刚刚放学回家的Hankson 正在思考一个有趣的问题。 今天在课堂上，老师讲解了如何求两个正整数c1 和c2 的最大公约数和最小公倍数。现 在Hankson 认为自己已经熟练地掌握了这些知识，他开始思考一个“求公约数”和“求公 倍数”之类问题的“逆问题”，这个问题是这样的：已知正整数a0,a1,b0,b1，设某未知正整 数x 满足： 1． x 和a0 的最大公约数是a1； 2． x 和b0 的最小公倍数是b1。 Hankson 的“逆问题”就是求出满足条件的正整数x。但稍加思索之后，他发现这样的 x 并不唯一，甚至可能不存在。因此他转而开始考虑如何求解满足条件的x 的个数。请你帮 助他编程求解这个问题。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] res =new int[n];
        for (int i=0;i<n;i++){
            int a0 = scanner.nextInt();
            int a1 = scanner.nextInt();
            int b0 = scanner.nextInt();
            int b1 = scanner.nextInt();
            res[i] = solve(a0,a1,b0,b1);
        }
        for (int i:res){
            System.out.println(i);
        }
    }
    public static int solve(int a0,int a1,int b0,int b1){
        int cnt=0;
        for (int i=a1;i<=b1;i+=a1){
            if (max(i,a0)==a1 && min(i,b0)==b1)
                cnt++;
        }
        return cnt;
    }
    public static int max(int a,int b){
        if (b==0) return a;
        return max(b,a%b);
    }
    public static int min(int a,int b){
        int i=Math.min(a,b);
        while (i<a*b){
            if (i%a==0 && i%b==0)
                return i;
            i+=Math.min(a,b);
        }
        return a*b;
    }
}
