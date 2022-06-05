public class JavaB11C {
    public static void main(String[] args) {
        int[] arr=new int[102];
        for (int i=2;i<=100;i++){
            int n=i;
            for (int j=2;j*j<=n;j++ ){
                while (n%j==0){
                    arr[j]++;
                    n/=j;
                }
            }
            if (n>1){
                arr[n]++;
            }
        }
        long ans=1;
        for (int i=2;i<=100;i++){
            if (arr[i]>0){
                ans*=(arr[i]+1);
            }
        }
        System.out.println(ans);
    }

}

