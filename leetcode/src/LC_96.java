public class LC_96 {
    public int numTrees(int n) {
        return count(1,n);
    }

    private int count(int lo, int hi) {
        if (lo > hi)
            return 1;
        int res = 0;
        for (int i=0;i<=hi;i++){
            int left = count(lo, i-1);
            int right = count(i+1,hi);
            res += left * right;
        }
        return res;
    }
}
