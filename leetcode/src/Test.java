import java.util.*;

public class Test {
    public static void main(String[] args) {
        LC_698 test = new LC_698();
        int[] nums = new int[]{10,5,3,2,6,4};
        int k = 3;
        boolean b = test.canPartionKSubsets(nums, k);
        System.out.println(b);
    }
}
