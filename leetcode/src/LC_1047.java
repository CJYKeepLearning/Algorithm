
import java.util.Stack;

public class LC_1047 {
    public static String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        int len = chars.length;
        Stack<Character> stack = new Stack();
        for (int i=0;i<chars.length;i++){
            if (!stack.isEmpty()){
                char a = stack.peek();
                if (a==chars[i]){
                    stack.pop();
                    len = len-2;
                    continue;
                }else
                    stack.push(chars[i]);
            }else
                stack.push(chars[i]);
        }
        /**简洁写法*/
        /*
         for (char s:chars){
            if(stack.isEmpty()|| s!=stack.peek()){
                stack.push(s);
            }else
                stack.pop();
        }
         */
        char[] chars1 = new char[len];
        for (int i=len-1;i>=0;i--)
            chars1[i] = stack.pop();

        String a = new String(chars1);
        return a;
    }

    public static void main(String[] args) {
        String a = "abbaca";
        String res = removeDuplicates(a);
        System.out.println(res);
    }
}