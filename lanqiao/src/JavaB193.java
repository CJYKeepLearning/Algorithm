import java.math.BigInteger;

public class JavaB193 {
    public static void main(String[] args) {
        BigInteger i1 = BigInteger.valueOf(1),i2=BigInteger.valueOf(1),i3=BigInteger.valueOf(1),i4=BigInteger.valueOf(0);
        for (int i = 4; i <= 20190324;i++){
            i4 = i1.add(i2).add(i3);
            i1 = i2;
            i2 = i3;
            i3 = i4;
        }
        System.out.println(i4.toString());
    }
}
