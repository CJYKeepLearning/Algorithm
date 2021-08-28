public class Fifth5_5 {
    public static void main(String[] args) {
        String s1="Kilograms";
        String s2 = "Pounds";
        System.out.printf("%-10s\t%6s\t|\t%-6s\t%10s\n",s1,s2,s2,s1);
        int a,b;
        for (int i=1;i<100;i++){
            a = 2*i-1;
            b = 15+5*i;
            System.out.printf("%-10d\t%6.1f\t|\t%-6d\t%10.2f\n",a,a*2.2,b,b/2.2);
        }
    }
}
