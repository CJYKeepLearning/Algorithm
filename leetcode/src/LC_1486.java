import java.util.Scanner;

public class LC_1486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = scanner.nextInt();
        int[] nums = new int[n];
        int res = start;
        for (int i=1;i<n;i++){
            nums[i] = start+2*i;
            res = res^nums[i];
        }
        System.out.println(res);
    }
}
