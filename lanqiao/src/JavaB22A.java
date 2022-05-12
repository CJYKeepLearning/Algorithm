import java.math.BigInteger;

public class JavaB22A {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(20);
        BigInteger n2 = BigInteger.ZERO;
        for (int i =1;i<=22;i++){
            n2 = n.multiply(n);
            n = n2;
        }
        System.out.println(n2.mod(BigInteger.valueOf(7)));
    }
}
