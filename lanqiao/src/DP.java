import java.lang.reflect.Array;
import java.util.Arrays;

// dp[i] 表示以 nums[i] 这个数结尾的最长递增子序列的长度

public class DP {
    public static void main(String[] args) {
        int i1=1,i2=1,i3=1,i4=0;
        for (int i =4;i<=20190324;i++){
            i4 = i1 + i2 + i3;
            if (i4 >= 10000)
                i4 = i4 % 10000;
            i1=i2;
            i2=i3;
            i3=i4;
        }
        System.out.println(i4);
    }
}
