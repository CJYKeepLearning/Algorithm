public class offer_05 {
    public static void main(String[] args) {
        String s = "We are happy";
        System.out.println(replaceStr(s));
    }
    public static String replaceStr(String s){
        char[] sChar = s.toCharArray();
        int count=0;
        for (int i=0;i<s.length();i++){
            if (sChar[i]==' ')
                count++;
        }
        char[] resChar = new char[s.length()+2*count];
        int oldSize = sChar.length;
        int newSize = resChar.length;
        for (int i = newSize-1,j=oldSize-1;i>=0;i--,j--){
            if (sChar[j]!=' '){
                resChar[i] = sChar[j];
            }else {
                resChar[i] = '0';
                resChar[i-1] = '2';
                resChar[i-2] = '%';
                i -= 2;
            }
        }

        return new String(resChar);
    }
}
