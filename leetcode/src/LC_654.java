public class LC_654 {
    public static void main(String[] args) {

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMax(nums,0,nums.length-1);
    }

    private TreeNode constructMax(int[] nums, int left, int right) {
        if (left > right){
            return null;
        }
        int idx = 0, max = 0;
        for (int i = left;i<=right;i++){
            if (max < nums[i]){
                max = nums[i];
                idx = i;
            }
        }
        TreeNode root = new TreeNode(max);
        TreeNode l = constructMax(nums,left,idx-1);
        root.left = l;
        TreeNode r = constructMax(nums,idx+1,right);
        root.right = r;
        return root;
    }
}
