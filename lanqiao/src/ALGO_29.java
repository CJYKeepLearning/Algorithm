import java.util.*;

public class ALGO_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[M][2];
        for (int i=0;i<M;i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
/*        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }*/
        int[] temp = new int[2];
        temp[0] = arr[0][0];
        temp[1] = arr[0][1];
        int count=0;
        for (int[] a:arr){
            if (a[0]<=temp[1]){
                temp[1] = Math.max(a[1],temp[1]);
            }else {
                count = count + temp[1]-temp[0]+1;
                temp[0] = a[0];
                temp[1] = a[1];
            }
        }
        count = count + temp[1]-temp[0]+1;
        System.out.println(L-count+1);
    }
}
