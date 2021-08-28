import java.util.LinkedList;
import java.util.Scanner;

public class Huffman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1){
            System.out.println(sc.nextInt());
        }else {
            int min1;
            int min2;
            int cost;
            int total=0;
            LinkedList<Integer> integers = new LinkedList<>();
            for (int i=0;i<n;i++){
                integers.add(sc.nextInt());
            }
            while (integers.size()!=1){
                min1 = integers.get(0);
                for (Integer integer:integers){
                    if (integer<min1)
                        min1 = integer;
                }
                integers.removeFirstOccurrence(min1);
                min2 = integers.get(0);
                for (Integer integer:integers){
                    if(integer<min2)
                        min2=integer;
                }
                integers.removeFirstOccurrence(min2);
                cost = min1+min2;
                integers.add(cost);
                total+=cost;
            }
            System.out.println(total);
        }

    }
}
