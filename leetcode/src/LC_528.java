public class LC_528 {
    public static void main(String[] args) {
        Solution obj = new Solution(new int[]{3,14,1,7});
        System.out.println(obj.pickIndex());
    }
}
class Solution {
    int[] we;
    public Solution(int[] w) {
        we = new int[w.length+1];
        int pre = 0;
        for (int i=0;i<w.length;i++){
            we[i+1] = we[i] + w[i];
        }
    }

    public int pickIndex() {
        int total = we[we.length-1];
        int i =(int) (Math.random()*total);
        return binarySearch(i,0,we.length-1);
    }

    //二分查找
    private int binarySearch1(int i) {
        int low = 0,high = we.length-1;
        while (low<high){
            int mid = (high-low)/2 + low;
            if (we[mid]<i){
                low = mid +1;
            }else {
                high = mid;
            }
        }
        return low;
    }

    private int binarySearch(int i,int left,int right) {
        if (left == right){
            return left;
        }
        if (right-left == 1){
            return left;
        }
        int mid = left + (right-left)/2;
        if (we[mid]>i){
            return binarySearch(i,left,mid);
        }else if (we[mid]<i){
            return binarySearch(i,mid,right);
        }else {
            return mid;
        }
    }
}