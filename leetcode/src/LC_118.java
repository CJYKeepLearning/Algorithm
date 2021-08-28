import java.util.LinkedList;
import java.util.List;

public class LC_118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows==1){
            LinkedList list = new LinkedList();
            LinkedList l = new LinkedList();
            l.add(1);
            list.add(l);
            return list;
        }
        List<List<Integer>> pre1 = generate(numRows-1);

        List pre2 =(List) pre1.get(pre1.size()-1);


        List last = new LinkedList();
        last.add(1);
        for (int i=0;i<pre2.size()-1;i++){
            Integer temp = (Integer)pre2.get(i)+(Integer)pre2.get(i+1);
            last.add(temp);
        }
        last.add(1);
        pre1.add(last);
        return pre1;
    }
}
