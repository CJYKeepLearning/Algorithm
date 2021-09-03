import java.util.Comparator;
import java.util.PriorityQueue;

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
    //堆
    public int[] smallestKHeapSort(int[] arr, int k) {
        int[] ans = new int[k];
        if (k==0){
            return ans;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //先将前k个放入到最小堆中，再通过数组后面的数字进行维护
        for (int i=0;i<k;i++){
            queue.offer(arr[i]);
        }
        for (int i=k;i<arr.length;i++){
            if (queue.peek()>arr[i]){
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i=0;i<k;i++){
            ans[i] = queue.poll();
        }
        return ans;
    }
}
