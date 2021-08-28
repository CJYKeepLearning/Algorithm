import java.util.*;

public class ALGO_28b {
    public static List<Integer> lf = new LinkedList();  //存放后五个原始的形式
    public static List<Integer> res = new LinkedList<>();   //存放加完M后的应该的形式
    public static int count=0;  //计数
    public static int M;    //加M
    public static List<List<Integer>> resp = new LinkedList<>();    //全排列
    public static HashSet pre = new HashSet();  //存放前面的数
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        M = input.nextInt();
        //将外星人手指排序转成一个LinkedList表
        //7   前2个放在pre中，后五个放在选择列表中。
        if (N>10) {
            //前2个放到pre中
            int[] temp = new int[N-10];
            for (int i = 1; i <= N - 10; i++) {
                int t = input.nextInt();
                pre.add(t);
                temp[i-1] = t;
            }
            //后5个放到选择列表中
            int[] fingers = new int[10];
            for (int i = 0; i < 10; i++) {
                fingers[i] = input.nextInt();
                lf.add(fingers[i]);
            }
            /*------------------------*/
            //fingers中存放升序后的五个数,原始选择列表
            Arrays.sort(fingers);
            permute(fingers);
            for (int i=0;i<temp.length;i++){
                System.out.print(temp[i]+" ");
            }
        }else {
            int[] fingers = new int[N];
            for (int i = 0; i < N; i++) {
                fingers[i] = input.nextInt();
                lf.add(fingers[i]);
            }
            permute(fingers);
        }
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
