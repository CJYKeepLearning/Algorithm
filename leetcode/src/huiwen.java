import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        for(int i=100000;i<1000000;i++){
            int k = 0;
            int[] num = new int[6];
            while(i!=0){
                num[k]=i%10;
                i=i/10;
                k++;
            }
            int s=0;
            for (int o = 0;o<=5;o++){
                s=num[o]+s;
            }
            if(num[0]==num[5]&&num[1]==num[4]&&num[2]==num[3]&&s==n){
                System.out.println(i);
                break;
            }
        }
    }
}