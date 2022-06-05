import java.time.LocalDate;

public class CA11B {
    public static LocalDate left=LocalDate.of(1900,1,1);
    public static LocalDate right=LocalDate.of(9999,12,31);
    public static void main(String[] args) {
        int a,b,c;
        long count=0;
        while (right.compareTo(left)>=0){
            a=left.getYear();
            b=left.getMonthValue();
            c=left.getDayOfMonth();
            if (a%10==2||a/1000==2||a/10%10==2||a/100%10==2||b==2||b==12||c%10==2||c/10==2){
                count++;
            }
            left=left.plusDays(1);
        }
        System.out.println(count);
    }
}