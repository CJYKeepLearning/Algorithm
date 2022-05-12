public class JavaB22B {
    public static void main(String[] args) {
        int res = 0;
        for (double i = 2022;i<=2022222022;i++){
            String t = String.valueOf(i);
            char[] chars = t.toCharArray();
            if (isOk(chars)){
                res++;
            }
        }
        System.out.println(res);
    }

    private static boolean isOk(char[] chars) {
        for (int i=0,j = chars.length-1-i;i<j;i++,j--){
            if (chars[i+1]<chars[i])
                return false;
            if (chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }
}
