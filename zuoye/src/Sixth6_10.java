import javax.swing.plaf.IconUIResource;

public class Sixth6_10 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i=2;i<10000;i++){
            if (isPrime(i)){
                cnt++;
                if (cnt%10==0){
                    System.out.printf("%-5d\n",i);
                }else {
                    System.out.printf("%-5d",i);
                }
            }
        }
        System.out.println();
        System.out.println("小于10000的素数个数为："+cnt);
    }
    public static boolean isPrime(int number){
        for (int divisor = 2;divisor<=number/2;divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
