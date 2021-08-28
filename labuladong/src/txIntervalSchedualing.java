import java.util.Arrays;
import java.util.Comparator;

public class txIntervalSchedualing {
    public static void main(String[] args) {
        int[][] intvs = {{-2147483646,-2147483645},{2147483646,2147483647}};
        intervalSchedule(intvs);
    }
    public static int intervalSchedule(int[][] intvs){
        Arrays.sort(intvs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);//防止差值过大而使用的比较方法！
            }
        });
        int count = 1;
        int x_end = intvs[0][1];
        for (int[] interval:intvs){
            int start = interval[0];
            if (start > x_end){
                count++;
                x_end = interval[1];
            }
        }
        return count;
    }
/*    public static int intervalSchedule(int[][] intvs){
        if (intvs.length==0) return 0;

        Arrays.sort(intvs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int cnt = 1;
        int end = intvs[0][1];
        //Myself写法
        for (int i=1;i<intvs.length;i++){
            if (intvs[i][0]>=end){
                cnt++;
                end = intvs[i][1];
            }
        }
        //for each写法
        for (int[] interval:intvs){
            int start = interval[0];
            if (start>=end){
                cnt++;
                end = interval[1];
            }
        }
        return cnt;
    }*/
}
