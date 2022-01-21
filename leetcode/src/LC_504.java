import java.util.HashMap;

public class LC_504 {
    private int[] preSums;
    public int subarraySum(int[] nums, int k) {
        preSums = new int[nums.length+1];
        int cnt = 0;
        for (int i=1;i<=nums.length;i++){
            preSums[i] = preSums[i-1]+nums[i-1];
        }
        for (int i=0;i<=nums.length;i++){
            int tmp = preSums[i];
            for (int j=1;j<=nums.length-i;j++){
                if (tmp + k == preSums[i+j])
                    cnt++;
            }
        }
        return cnt;
    }
    public int subarraySum2(int[] nums, int k) {
        int cnt = 0,sum0_i= 0;
        HashMap<Integer,Integer> presum = new HashMap();
        for (int i=0;i<nums.length;i++){
            sum0_i += nums[i];
            int sum0_j = sum0_i - k;
            if (presum.containsKey(sum0_j)){
                cnt += presum.get(sum0_j);
            }
            presum.put(sum0_i,presum.getOrDefault(sum0_i,0)+1);
        }
        return cnt;
    }
}
