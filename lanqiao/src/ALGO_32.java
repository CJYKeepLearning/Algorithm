import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ALGO_32 {
    static final int X = 8;
    public static LinkedList<Character> target = new LinkedList<>();
    public static void main(String[] args) {
        char[] keys ={'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int w = scanner.nextInt();
        String string = scanner.next();
        if (w<=X){
            for (int i=0;i<string.length();i++){
                target.add(string.charAt(i));
            }
            LinkedList<Character> trace = new LinkedList<>();
            backtrack(keys,trace,s,t,w);
            for (int i=0;i<res.size();i++){
                if (i==5)
                    break;
                String temp = trans(res.get(i));
                System.out.println(temp);
            }
        }else {
            String pre = string.substring(0,string.length()-X);
            for (int i=string.length()-X;i<string.length();i++){
                target.add(string.charAt(i));
            }
            LinkedList<Character> trace = new LinkedList<>();
            backtrack(keys,trace,s,t,w-string.length()+X);
            for (int i=0;i<res.size();i++){
                if (i==5)
                    break;
                String temp = trans(res.get(i));
                System.out.print(pre);
                System.out.println(temp);
            }
        }
    }
    public static boolean flag;
    public static List<List<Character>> res = new LinkedList<>();
    public static void backtrack(char[] keys,LinkedList trace,int s,int t,int w){
        if (trace.size()==w){
            if (unValid(trace)){
                if (flag){
                    res.add(new LinkedList<>(trace));
                }
                if (trace.equals(target)){
                    flag = true;
                }
            }
            return;
        }
        for (int i=s;i<=t;i++){
            if (!trace.contains(keys[i])){
                    trace.add(keys[i]);
                    backtrack(keys,trace,s,t,w);
                    trace.removeLast();
                }
            }
    }
    public static boolean unValid(List<Character> trace){
        for (int i=0;i<trace.size()-1;i++){
            if ((trace.get(i)-'a')>(trace.get(i+1)-'a'))
                return false;
        }
        return true;
    }
    public static String trans(List<Character> list){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<list.size();i++){
            stringBuilder.append(list.get(i));
        }
        return stringBuilder.toString();
    }
}
