public class CB10A {
    public static void main(String[] args) {
        int x = 2020;
        int t = 2019*2019;
        while (true){
            int x1 = x*x;
            int y1 = 2*x1-t;
            int y =(int) Math.sqrt(y1);
            if(y * y == y1){
                System.out.println(x+y);
                break;
            }
            x++;
        }
    }
}
