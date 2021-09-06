import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 12;
        LC_704 test = new LC_704();
        System.out.println(test.search(nums,target));
    }
}
