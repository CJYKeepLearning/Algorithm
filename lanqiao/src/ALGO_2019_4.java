public class ALGO_2019_4 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i=1;i<=672;i++){
            for (int j=i+1;j<=2019-i;j++){
                for (int k=j+1;k<=2019-i-j;k++){
                    if (f(i)&&f(j)&&f(k)){
                        if (i+j+k==2019)
                            cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    public static boolean f(int n){
        while (n>=10){
            int temp = n%10;
            if (temp==2||temp==4)
                return false;
            n = n/10;
        }
        if (n==2||n==4)
            return false;
        return true;
    }
}
