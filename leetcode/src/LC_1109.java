public class LC_1109 {
    public static void main(String[] args) {
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int[] ans = corpFlightBookings2(bookings,5);
        for (int i:ans
             ) {
            System.out.print(i+" ");
        }
    }
    //常规
    public static int[] corpFlightBookings1(int[][] bookings, int n) {
        int len = bookings.length;
        int[] ans = new int[n];
        for (int i=0;i<len;i++){
            int fi = bookings[i][0];
            int li = bookings[i][1];
            int si = bookings[i][2];
            for (int k = fi;k<=li;k++){
                ans[k-1] += si;
            }
        }
        return ans;
    }
    //差分数组
    public static int[] corpFlightBookings2(int[][] bookings, int n) {
        int[] ori = new int[n];
        int l,r,s;
        for (int i=0;i<bookings.length;i++){
            l = bookings[i][0];
            r = bookings[i][1];
            s = bookings[i][2];
            ori[l-1] += s;
            if (r<n)
            ori[r] -= s;
        }
        for (int i=1;i<n;i++){
            ori[i] += ori[i-1];
        }
        return ori;
    }
}
