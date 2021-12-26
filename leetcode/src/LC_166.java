public class LC_166 {
    public String fractionToDecimal(int numerator, int denominator) {
        double num = (double)numerator;
        double den = (double)denominator;
        double res = num/den;
        String sres = String.valueOf(res);
        StringBuffer bres;
        return sres;
    }
}
