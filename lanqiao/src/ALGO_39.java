import java.util.*;

public class ALGO_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet();
        for (int i=0;i<10;i++){
            hashSet.add(scanner.nextInt());
        }
        Integer[] nums = new Integer[hashSet.size()];
        Integer[] new_nums = hashSet.toArray(nums);
        Arrays.sort(new_nums);
        for (int i:new_nums){
            System.out.println(i);
        }
    }
}
