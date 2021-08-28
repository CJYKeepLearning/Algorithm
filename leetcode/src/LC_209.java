/*
class lc_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int min=nums.length+1;
        for (int i=0;i<nums.length;i++){
            int s=0;
            for (int j=i;j<nums.length;j++){
                s+=nums[j];
                if (s>=target){
                    if(j-i+1<min)
                        min=j-i+1;
                }
            }
        }
        if (min<nums.length+1)
            return min;
        else
            return 0;
    }
}*/
public class LC_209{
    public static int minSubArrayLen(int target, int[] nums) {
        int result=nums.length;
        int sum=0;
        int i=0;
        int subLength = 0;
        /*key*/
        for (int j=0;j<nums.length;j++){
            sum+=nums[j];
            while (sum>=target){
                subLength = j-i+1;
                result = result < subLength? result:subLength;
                sum -= nums[i++];
            }
        }

         /**/
        return  (result == nums.length ? 0:result);
    }

    public static void main(String[] args) {
        int t  = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(t,nums));
    }
}