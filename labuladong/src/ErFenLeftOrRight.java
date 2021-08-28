public class ErFenLeftOrRight {
    //左侧边界
    public static int left_bound(int[] nums,int target){
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length;
        while (left<right){
            int mid = (left+right)/2;
            if (nums[mid]==target)
                right = mid;
            else if (nums[mid]<target)
                left = mid+1;
            else if (nums[mid]>target)
                right = mid;
        }
        if (left==nums.length) return -1;   //left范围是[0,nums.length],这里为了以防nums[]越界，所以看的nums.length情况
        return nums[left]==target? left:-1; //看除了上述的情况
    }
    //右侧边界
    public static int right_bound(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        while (left<right){
            int mid = (left+right)/2;
            if (nums[mid] == target)
                left = mid+1;   //这里必须是mid+1原因：mid=(left+right)/2,当left与right只有一位之差时，mid = left，无法判断到right
            else if (nums[mid]<target)
                left = mid+1;
            else if (nums[mid]>target)
                right = mid;
        }
        if (left==0) return -1;
        return nums[left-1]==target?(left-1):-1;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,6};
        int target = 5;
        int ans = left_bound(nums,target);
    }
}
