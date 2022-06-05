import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CA11E {

    public static long pow(long a, int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= a;
        }
        return ans;
    }


    public static List<Long> genList1(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }

        if (n == 1) {
            List<Long> result = new ArrayList<>();
            result.add(1L);
            result.add(8L);
            return result;
        }

        List<Long> prev = genList1(n - 1);
        List<Long> result = new ArrayList<>(prev);

        result.add(result.get(result.size() - 1) * 3);
        result.add(result.get(result.size() - 1) * 9);

        return result;
    }

    public static List<Long> genList2(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }

        if (n == 1) {
            List<Long> result = new ArrayList<>();
            result.add(8L);
            result.add(2L);
            return result;
        }

        List<Long> prev = genList2(n - 1);
        List<Long> result = new ArrayList<>();

        result.add(pow(9, n) - 1);
        result.add(result.get(result.size()- 1) / 4L);
        result.add(prev.get(1) * 3);
        for (int i = 1; i < prev.size(); i++) {
            result.add(prev.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Long> list1 = genList1(n);
        List<Long> list2 = genList2(n);

        long ans = 0;
        for (int i = 0; i < n * 2; i++) {
            ans += list1.get(i) * list2.get(i);
        }

        System.out.println(ans);

    }
}
