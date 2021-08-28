import java.util.Stack;

public class LC_150 {
    public static int evalRPN(String[] tokens) {
        int len = tokens.length;
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<len;i++){
            String s = tokens[i];
            int item;
            char c;
            try {
                item = Integer.valueOf(s);
                stack.push(item);
            }catch (NumberFormatException e){
                c=s.charAt(0);
                int a = stack.pop();
                int b = stack.pop();
                switch (c){
                    case '+':
                        b +=a;break;
                    case '-':
                        b -=a;break;
                    case '*':
                        b *=a;break;
                    case '/':
                        b /=a;break;
                }
                stack.push(b);
            }
        }
        int res = stack.pop();
        return res;
    }

    public static void main(String[] args) {
        String[] strings = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
/*
        String s = strings[3];
        int item= Integer.valueOf(s);
        System.out.println(item);*/

        int a = evalRPN(strings);
        System.out.println(a);
    }
}
