public class IGC_17_14 {
    //选择排序
    public int[] smallestKSelectSort(int[] arr, int k) {
        int[] ans = new int[k];
        for (int i=0;i<k;i++){
            int min = arr[i];
            int index = i;
            for (int j=i;j<arr.length;j++){
                if (min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
            ans[i] = min;
        }
        return ans;
    }
    //快速排序
    public int[] smallestKQuickSort(int[] arr, int k) {
        quickSort(arr,0,arr.length-1,k);
        int[] ans = new int[k];
        for (int i=0;i<k;i++){
            ans[i] = arr[i];
        }
        return ans;
    }
    public void quickSort(int[] arr,int left,int right,int k){
        int l = left,r=right;
        if (l>r)
            return;
        int tmp = arr[l];
        while (l<r){
            while (tmp<=arr[r] && l<r){
                r--;
            }
            while (tmp>=arr[l]&&l<r){
                l++;
            }
            if (l<r){
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
        arr[left] = arr[l];
        arr[l] = tmp;
        if (left<k){
            quickSort(arr,left,r-1,k);
            quickSort(arr,r+1,right,k);
        }
    }
}
