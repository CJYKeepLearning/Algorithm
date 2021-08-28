public class LC_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = numbers.length-1;
        while (numbers[ans[0]]+numbers[ans[1]]!=target){
            if (numbers[ans[0]]+numbers[ans[1]]<target)
                ans[0]++;
            else
                ans[1]--;
        }
        ans[0]++;
        ans[1]++;
        return ans;
    }
}
