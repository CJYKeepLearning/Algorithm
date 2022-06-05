import java.util.Scanner;

public class AcWing_466 {
    // 回文日期
    // 先枚举回文数 再判断日期是否合法
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int date1 = sc.nextInt();
        int date2 = sc.nextInt();
        int res = 0;
        for (int i=1000;i<100000;i++){
            int date = i,x=i;
            for (int j=0;j<4;j++) {
                date = date * 10 + x%10;
                x /= 10;
            }
            if (date1 <= date && date <= date2 && check_valid(date)) res ++;
        }
        System.out.println(res);
    }

    private static boolean check_valid(int date) {
        int year = date / 10000;
        int month = date % 10000 / 100;
        int day = date % 100;

        if (month<=0 || month >= 13 || day <= 0) return false;

        if (month != 2 && day > days[month]) return false;
        if (month == 2)
        {
            boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            if (day > 28 + (leap == true ? 1: 0)) return false;
        }
        return true;

    }
}
