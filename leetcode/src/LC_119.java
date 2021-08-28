import java.util.LinkedList;
import java.util.List;

public class LC_119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex==0){
            LinkedList l = new LinkedList();
            l.add(1);
            return l;
        }
        List pre = getRow(rowIndex-1);
        List last = new LinkedList();
        last.add(1);
        for (int i=0;i<pre.size()-1;i++){
            Integer temp = (Integer)pre.get(i)+(Integer)pre.get(i+1);
            last.add(temp);
        }
        last.add(1);
        return last;
    }

}
