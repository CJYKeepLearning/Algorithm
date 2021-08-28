public class Third2 {
    public static final int KZSITUATION=3;
    public static void main(String[] args) {
        int a[] = new int[6];
        int b[] = new int[6];
        int a1=100;
        int[] empCar = {0,7,6,5,7,6,7,7,8,9};
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                for (int k=1;k<=3;k++){
                    for (int l=1;l<=3;l++){
                        for (int m=1;m<=3;m++){
                            for (int n=1;n<=3;n++){
                                a[0] = i;
                                a[1] = j;
                                a[2] = k;
                                a[3] = l;
                                a[4] = m;
                                a[5] = n;
                                int b1=0;
                                for (int i1=0;i1<=4;i1++){
                                    int begin = a[i1];
                                    int end = a[i1+1];
                                    b1 += empCar[(begin-1)*KZSITUATION+end];
                                }
                                if(a1>b1+7-a[5])for(int h=0;h<=5;b[h]=a[h++]);
                                a1=a1<b1+7-a[5]?a1:b1+7-a[5];
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("最少空载数%d\n",a1);
        for(int i=0;i<=5; System.out.printf(" %d ",b[i++]));
    }
}
