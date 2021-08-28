public class Second2 {
    public static final int ONFIRST=1;
    public static final int ONLAST=3;
    public static final int KZSITUATION=3;
    public static final int LXDAY=5;
    public static void main(String[] args) {
        int[] a = new int[6];
        int[] b = new int[6];
        int a1=100;
        int[] empCar = {0,7,6,5,7,6,7,7,8,9};
        int[] im = new int[a.length];
                //new int[KZSITUATION*KZSITUATION+1];//下标从1开始
        int num=0;
        for(int k=0;k<a.length;k++){

            im[k] = num;
            for (im[k]=1;im[k]<=3;im[k]++){

            }
        }
                for (int i=0;i<a.length;i++){
                    a[i] = im[i];
                }
                int temp=0;
                for (int m=0;m<=4;m++){
                    int begin = a[m];
                    int end = a[m+1];
                    temp += empCar[(begin-1)*KZSITUATION+end];
                }
                if (a1>temp){
                    for(int h=0;h<=5;b[h]=a[h++]);
                }
                a1=a1>temp?temp:a1;
        }


/*        System.out.println("最少空载数:"+a1);
        for (int record:a){
            System.out.print(" "+record);
        }*/
    }
