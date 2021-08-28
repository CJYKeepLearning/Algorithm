import java.util.Scanner;

public class ALGO_32b {
    static final int MAXW = 30;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int w = scanner.nextInt();
        int i,j,count;
        i = w;
        count = 0;
        String sJam = scanner.next();
        char[] jam = sJam.toCharArray();
        char[] tJam = jam.clone();
        while (--i>=0){
            j=i;
            while (tJam[j]+1<'a'+t-(w-j)+1){
                tJam[j] += 1;
                while (++j<w){
                    tJam[j] =(char) ((int)tJam[j-1]+1);
                }
                count++;
                System.out.println(tJam);
                if (count==5){
                    return;
                }
                j = w-1;
            }
            i = j;
        }
    }
}
