import java.util.*;
public class high_accuracy {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str_a=scanner.nextLine();
        String str_b=scanner.nextLine();
        scanner.close();
        System.out.println(plus(str_a,str_b));
    }
    public static String plus(String str_a,String str_b) {
        char[] a=reverse(str_a);
        char[] b=reverse(str_b);
        int maxLength=a.length>=b.length? a.length:b.length;
        int[] result=new int[maxLength+1];
        for(int i=0;i<maxLength;i++) {
            int value_a=i<a.length? a[i]-48 : 0;
            int value_b=i<b.length? b[i]-48 : 0;
            int temp=value_a+value_b+result[i];
            if(temp>=10) {
                result[i]=temp%10;
                result[i+1]=temp/10;
            }else {
                result[i]=temp;
            }
        }
        return reverse2(result);
    }
    public static String reverse2(int[] arr) {
        //int[]翻转后再转为字符串
        int len=arr.length;
        char[] ch=new char[len];
        for(int i=0;i<len;i++) {
            int k=len-i-1;
            ch[k]=(char)(arr[i]+48);
        }
        String result=new String(ch);
        while(result.startsWith("0")) {
            //去除前面多余的0
            result=result.substring(1);
        }
        return result;
    }

    public static char[] reverse(String str) {
        //字符串反转
        int len=str.length();
        char[] result=new char[len];
        char[] ch_str=str.toCharArray();
        for(int i=0;i<len;i++) {
            int k=len-i-1;
            result[k]=ch_str[i];
        }
        return result;
    }
}
