import java.util.ArrayList;

public class LC_1588 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays2(arr));
        ArrayList arrayList =  new ArrayList<>();
    }
    //O^3
    public static int sumOddLengthSubarrays1(int[] arr) {
        int ans = 0;
        for (int i=1;i<=arr.length;i+=2){
            for (int k=0;k<arr.length-(i-1);k++){
                int temp = 0;
                for (int m=k;m<k+i;m++){
                    temp += arr[m];
                }
                ans+=temp;
            }
        }
        return ans;
    }
    //使用前缀和
    public static int sumOddLengthSubarrays2(int[] arr) {
        int ans = 0;
        int[] preFixSum = new int[arr.length+1];
        int pre = 1;
        for (int e:arr){
            preFixSum[pre] = preFixSum[pre-1]+e;
            pre++;
        }
        for (int i=1;i<=arr.length;i+=2){
            for (int k=0;k<arr.length-(i-1);k++){
                ans+=(preFixSum[k+i]-preFixSum[k]);
            }
        }
        return ans;
    }
}
