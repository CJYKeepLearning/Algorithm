import jdk.internal.org.objectweb.asm.Handle;

import java.util.*;

public class ALGO_28 {
    //星际交流
    public static int N;
    public static int M;
    public static List<Integer> lf = new LinkedList();
    public static List<List<Integer>> resp = new LinkedList<>();
    public static List<Integer> res = new LinkedList();
    public static int count=0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        M = input.nextInt();
        //将外星人手指排序转成一个LinkedList表
        for (int i=0;i<N;i++){
            lf.add(input.nextInt());
        }
        //全排列的选择列表
        int[] fingers = new int[N];
        for (int i=0;i<N;i++){
            fingers[i] = i+1;
        }
        permute(fingers);
        for (int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
    public static void permute(int[] nums){
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums,track,false);
    }
    public static void backtrack(int[] nums,LinkedList<Integer> track,boolean flag){
        if (track.size()==nums.length){
            resp.add(new LinkedList<>(track));
            if (resp.contains(lf)){
                count++;
                if (count==M+1){
                    res = new LinkedList<>(track);
                    flag = true;
                }
            }
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (track.contains(nums[i]))
                continue;
            track.add(nums[i]);
            backtrack(nums,track,flag);
            if (flag==true)
                return;
            track.removeLast();
        }
    }
}
