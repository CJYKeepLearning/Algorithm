public class ALGO_2019_3 {
    public static void main(String[] args) {
        int a=1,b=1,c=1,d=0;
        for (int i=4;i<=20190324;i++){
            d = a+b+c;
            d = d%10000;
            a=b;
            b=c;
            c=d;
        }
        System.out.println(d);
    }
}
