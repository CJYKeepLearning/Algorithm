public class LC_165 {
    public int compareVersion1(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int min = v1.length>v2.length?v2.length:v1.length;
        int i;
        for (i=0;i<min;i++){
            int ans = compareVersionString(v1[i],v2[i]);
            if (ans == 0 )
                continue;
            else
                return ans;
        }
        if (v1.length == v2.length)
            return 0;
        if (v1.length>v2.length){
            int sum = 0;
            while (i<v1.length) {
                sum += subStringWithoutZero(v1[i++]);
                if (sum > 0)
                    return 1;
            }
        }
        if (v1.length<v2.length){
            int sum = 0;
            while (i<v2.length){
                sum += subStringWithoutZero(v2[i++]);
                if (sum>0)
                    return -1;
            }
        }
        return 0;
    }
    public int compareVersionString(String version1, String version2){
        int v1 = subStringWithoutZero(version1);
        int v2 = subStringWithoutZero(version2);
        if (v1>v2){
            return 1;
        }else if (v1<v2){
            return -1;
        }else
            return 0;
    }
    public int subStringWithoutZero(String s){
        if (s.length()==1 && s.startsWith("0"))
            return 0;
        if (s.startsWith("0")){
            s = s.substring(1);
            return subStringWithoutZero(s);
        }else
            return Integer.valueOf(s);
    }
    //字符串分割
    //对于“."使用"\\."进行分割
    //注意可以可以认为不存在下标的修订号为0
    public int compareVersion2(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for (int i = 0; i < v1.length || i < v2.length; ++i) {
            int x = 0, y = 0;
            if (i < v1.length) {
                x = Integer.parseInt(v1[i]);
            }
            if (i < v2.length) {
                y = Integer.parseInt(v2[i]);
            }
            if (x > y) {
                return 1;
            }
            if (x < y) {
                return -1;
            }
        }
        return 0;
    }
}
