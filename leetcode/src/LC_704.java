public class LC_704 {
    public int search(int[] nums, int target) {
        int idx = searchSeg(nums,target,0,nums.length-1);
        return idx;
    }

    private int searchSeg(int[] nums, int target, int l, int r) {
        if (l>r)
            return -1;
        int mid = l+(r-l)/2;
        if (nums[mid]==target)
            return mid;
        else if (nums[mid]>target){
            return searchSeg(nums,target,l,mid-1);
        }else {
            return searchSeg(nums,target,mid+1,r);
        }
    }
}
