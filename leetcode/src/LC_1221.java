public class LC_1221 {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int cnt = 0;
        int l=0,r=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='L')
                l++;
            else r++;
            if (l == r){
                cnt++;
                l = 0;
                r = 0;
            }
        }
        return cnt;
    }
}
