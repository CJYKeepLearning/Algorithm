import java.util.Stack;

public class LC_20 {

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int len = chars.length;
        if (chars[len-1]=='('||chars[len-1]=='{'||chars[len-1]=='[')
            return false;
        if (chars[0]==')'||chars[0]=='}'||chars[0]==']')
            return false;
        for (int i=0;i<len;i++){
            if (chars[i]=='）'){
                if (stack.peek()!='(')
                    return false;
                else
                    stack.pop();
            }else if (chars[i]=='}'){
                if (stack.peek()!='{')
                    return false;
                else
                    stack.pop();
            }else if (chars[i]==']'){
                if (stack.peek()!='[')
                    return false;
                else
                    stack.pop();
            }
            else
                stack.push(chars[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "({))";
        if (isValid(s))
            System.out.println("Valid");
        else
            System.out.println("unValid");
    }
}
/**绝了*/
/*class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}*/
