import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LC_1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String first = scanner.next();
        String second = scanner.next();
        Solution1078_1 solution1078 = new Solution1078_1();
        String[] ocurrences = solution1078.findOcurrences(text, first, second);
        for (int i=0;i<ocurrences.length;i++){
            System.out.println(ocurrences[i]);
        }
    }
}
class Solution1078_1 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strings = text.split(" ");
        StringBuffer resultsBuffer = new StringBuffer();
        int i=0;
        int cnt=0;
        for (;i<strings.length-2;i++){
            if (strings[i].equals(first)){
                if (strings[i+1].equals(second)){
                    resultsBuffer.append(strings[i+2]+" ");
                    cnt++;
                }
            }
        }
        if (cnt==0)
            return new String[0];
        else {
            String[] results = resultsBuffer.toString().split(" ");
            return results;
        }
    }
}
class Solution1078_2 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strings = text.split(" ");
        List<String> list = new LinkedList<>();
        for (int i=0;i<strings.length-2;i++){
            if (strings[i].equals(first)){
                if (strings[i+1].equals(second)){
                    list.add(strings[i+2]);
                }
            }
        }
        int size = list.size();
        String[] ret = new String[size];
        for (int i = 0; i < size; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}