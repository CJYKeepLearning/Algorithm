public class ALGO_12 {
    //幂方分解
/*    任何一个正整数都可以用2的幂次方表示。例如：
      137=27+23+20
      同时约定方次用括号来表示，即ab 可表示为a（b）。
      由此可知，137可表示为：
            　　2（7）+2（3）+2（0）
            　　进一步：7= 22+2+20 （21用2表示）
            　　3=2+2(0)
            　　所以最后137可表示为：
            　　2（2（2）+2+2（0））+2（2+2（0））+2（0）
            　　又如：
            　　1315=210 +28 +25 +2+1
            　　所以1315最后可表示为：
            　　2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）*/
    public static void main(String[] args) {
        int N=5;
        divide(N);
    }
    public static void divide(int n){
        if (n==0)
            return;
        else if (n==1){
            System.out.print("2(0)");
        }else if(n==2){
            System.out.print("2");
        }else {
            System.out.print("2(");
            while (true){
                int i = help(n);
                if (i==1) {
                    System.out.print("2");
                    break;
                }
                else{
                    divide(i);
                    n = n-(int)Math.pow(2,i);
                    if (n>0)
                        System.out.print(")+");
                    else{
                        System.out.print(")");
                        break;
                    }
                }
            }
        }
    }
    public static int help(int n){
        int a=2;
        int i;
        for (i=1;i<n;i++){
            if (a*2<n)
                a = a*2;
            else
                break;
        }
        return i;
    }
}
