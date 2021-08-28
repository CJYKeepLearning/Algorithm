import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List a = new LinkedList();
        if (a instanceof LinkedList){
            System.out.println("多态！");
        }
        LinkedList b = new LinkedList();
        test(b);
    }
    public static void test(List list){
        if (list instanceof LinkedList){
            System.out.println("duotai");
        }
    }
}


