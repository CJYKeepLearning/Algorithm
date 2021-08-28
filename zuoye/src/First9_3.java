import java.util.Date;

public class First9_3 {
    public static void main(String[] args) {
        for (int i=0;i<8;i++){
            int time = (int)(10000*Math.pow(10,i));
            Date date = new Date(time);
            System.out.println(date.toString());
        }
    }
}
