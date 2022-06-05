import java.util.Arrays;
import java.util.Scanner;

public class AcWing_1236 {
    // 递增三元组
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        // 枚举B
        long res = 0;
        for (int j=0;j<n;j++){
            int i = binarySearchLeft(a,b[j]);
            int k = binarySearchRight(c,b[j]);
            res += i*k;
        }
        System.out.println(res);
    }
    static int binarySearchLeft(int[] num,int n){
        int left = 0,right = num.length;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (num[mid] == n){
                right = mid;
            }else if (num[mid] > n){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
    static int binarySearchRight(int[] num,int n){
        int left = 0,right  = num.length;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (num[mid] == n){
                left = mid + 1;
            }else if (num[mid] > n){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        if (left == 0){
            return num.length;
        }
        if (left == num.length){
            return 0;
        }else {
            return num.length - left;
        }
    }
}
