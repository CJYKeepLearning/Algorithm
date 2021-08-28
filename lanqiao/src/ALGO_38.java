import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ALGO_38 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //n名同学，m个水龙头
        int n = scanner.nextInt();//5
        int m = scanner.nextInt();//3
        int[] M = new int[m];//模拟水龙头

        for (int i=0;i<Math.min(n,m);i++){
            M[i] = scanner.nextInt();
        }
        Queue<Integer> q = new LinkedList<>();//模拟排队的学生队列
        for (int i=m+1;i<=n;i++)
            q.add(scanner.nextInt());
        int res=0;
        while (q.peek()!=null){
            int min = minTime(M);
            for (int i=0;i<Math.min(n,m);i++){
                M[i] -= min;
                if (M[i]==0){
                    if (q.peek()!=null)
                    M[i] = q.poll();
                }
            }
            res += min;
        }
        res += maxTime(M);
        System.out.println(res);
    }
    public static int minTime(int[] nums){
        int min=nums[0];
        for (int i:nums)
            min = Math.min(min,i);
        return min;
    }
    public static int maxTime(int[] nums){
        int max = nums[0];
        for (int i:nums)
            max = Math.max(max,i);
        return max;
    }
}
