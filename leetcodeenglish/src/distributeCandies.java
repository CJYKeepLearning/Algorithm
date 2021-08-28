import java.util.HashSet;

public class distributeCandies {
    public static int distributeCandies(int[] candyType) {
        int n = candyType.length/2;
        HashSet hashSet = new HashSet();
        for (int i=0;i<candyType.length;i++)
            hashSet.add(candyType[i]);

        return Math.min(n,hashSet.size());
    }

    public static void main(String[] args) {
        int[] data = {1,1,2,2,3,3};
        System.out.println(distributeCandies(data));
    }
}
