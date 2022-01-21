import java.util.HashSet;
import java.util.Scanner;

public class Simulation_13_8 {
    static int n;
    static int[] a = new int[10010];
    static int[] p = new int[10010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1;i<=n;i++)
            p[i] = i;
        for (int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        for (int i=1;i<=n;i++){
            p[find(i)] = find(a[i]);
        }
        HashSet set = new HashSet();
        for (int i=1;i<=n;i++){
            set.add(find(i));
        }
        System.out.println(set.size());
    }

    private static int find(int i) {
        if (i == p[i]) return i;
        return find(p[i]);
    }
}
