import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        int k = 4;
        IGC_17_14 test = new IGC_17_14();
        int[] ans = test.smallestKHeapSort(arr,k);
        for (int i:ans
             ) {
            System.out.print(i+" ");
        }
    }
}
