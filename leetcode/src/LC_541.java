public class LC_541 {
    public static String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int i;
        for (i=0;i<s.length()/(2*k);i++){
            String pre = s.substring(i*(2*k),(2*i+1)*k);
            pre = reStr(pre);
            res.append(pre);
            res.append( s.substring((2*i+1)*k,(i+1)*(2*k)));
        }
        String last = s.substring(i*2*k);
        if (last.length()>k){
            String a = last.substring(0,k);
            a = reStr(a);
            res.append(a);
            res.append(last.substring(k));
        }else {
            res.append(reStr(last));
        }
        String resStr = res.toString();
        return resStr;
    }
    public static String reStr(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String a = "a";
        a = reverseStr(a,2);
        System.out.println(a);
    }

}
