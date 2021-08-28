public class LC_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bsf(nums,0,nums.length-1);
    }
    public TreeNode bsf(int[] nums,int left,int right){
        if(left>right)
            return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[left]);
        root.left = bsf(nums,left,mid-1);
        root.right = bsf(nums,mid+1,right);
        return root;
    }
}
