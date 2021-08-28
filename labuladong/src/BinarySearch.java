public class BinarySearch {
    //三种搜索方式
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,9};
        System.out.println(first(nums1,11));
        int[] nums2 = {1,2,2,2,3,5,7,9};
        System.out.println(second1(nums2,4));
        System.out.println(second2(nums2,0));
    }
    public static int first(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (target==nums[mid])
                return mid;
            else if (target<nums[mid]){
                right = mid-1;
            }else if(target>nums[mid]){
                left = mid+1;
            }
        }
        return -1;
    }
    public static int second1(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        while (left<right){
            int mid = left+(right-left)/2;
            if (target==nums[mid]){
                right = mid;
            }else if (target>nums[mid]){
                left = mid+1;
            }else if (target<nums[mid]){
                right = mid;
            }
        }
        if (left>=nums.length) return -1;
        return nums[left]==target?left:-1;
    }
    public static int second2(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (target==nums[mid]){
                right = mid-1;
            }else if(target<nums[mid]){
                right = mid-1;
            }else if(target>nums[mid]){
                left = mid+1;
            }
        }
        if (left>=nums.length) return -1;
        return nums[left]==target?left:-1;
    }
}
