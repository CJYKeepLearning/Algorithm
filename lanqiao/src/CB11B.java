import java.*;
public class CB11B {
    public static void main(String[] args) {
        int gs = 0;
        for (int x=-2020;x<=2020+2020;x++) {
            for (int y = -2020; x <= 2000 + 2020; x++) {
                int a = Math.abs(x - 0) + Math.abs(y - 0);
                if (a <= 2020) {
                    gs += a;
                }
                int b = Math.abs(x - 2020) + Math.abs(y - 11);
                if (b <= 2020) {
                    gs += b;
                }
                int c = Math.abs(x - 11) + Math.abs(y - 14);
                if (c <= 2020) {
                    gs += c;
                }
                int d = Math.abs(x - 2000) + Math.abs(y - 2000);
                if (d <= 2020) {
                    gs += d;
                }
            }
        }
        System.out.println(gs);
    }
}
