import javax.sound.sampled.Line;
import java.util.*;

public class ALGO_42 {
    public static int[][] record;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[][] time = new int[m+1][3];
        for (int i=1;i<=m;i++){
            time[i][0] = scanner.nextInt();
            time[i][1] = scanner.nextInt();
            time[i][2] = i;
        }
        record = new int[m+1][3];
        for (int i=1;i<=m;i++){
            record[i][0] = time[i][0];
            record[i][1] = time[i][1];
            record[i][2] = time[i][2];
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1])
                    return o1[2]-o2[2];
                return o1[1]-o2[1];
            }
        });
        LinkedList<Integer> list =  f(time,1,4);
        System.out.println(list.size());
        for (int i:list){
            System.out.print(i+" ");
        }
    }
    //使用递归！
    public static LinkedList<Integer> f(int[][] nums,int i,int j){
        if (i==j){
            LinkedList<Integer> list = new LinkedList<>();
            list.add(nums[i][2]);
            return list;
        }
            LinkedList<Integer> list = f(nums,i,j-1);
            if (record[list.getLast()][1]==nums[j][1] && record[list.getLast()][2]>nums[j][2]){
                list.removeLast();
                list.add(nums[j][2]);
            }
            else if (record[list.getLast()][1]<nums[j][0]){
                list.add(nums[j][2]);
            }
            else if (record[list.getLast()][2]>nums[j][2]){
                list.removeLast();
                list.add(nums[j][2]);
            }
            return list;
    }
}
