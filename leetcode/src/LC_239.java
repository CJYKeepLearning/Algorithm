import java.util.Comparator;
import java.util.PriorityQueue;

public class LC_239 {
/*
    方法一：优先队列

    对于「最大值」，我们可以想到一种非常合适的数据结构，那就是优先队列（堆），其中的大根堆可以帮助我们实时维护一系列元素中的最大值。

    对于本题而言，初始时，我们将数组nums 的前 k 个元素放入优先队列中。
    每当我们向右移动窗口时，我们就可以把一个新的元素放入优先队列中，此时堆顶的元素就是堆中所有元素的最大值。
    然而这个最大值可能并不在滑动窗口中，在这种情况下，这个值在数组 \textit{nums}nums 中的位置出现在滑动窗口左边界的左侧。
    因此，当我们后续继续向右移动窗口时，这个值就永远不可能出现在滑动窗口中了，我们可以将其永久地从优先队列中移除。

    我们不断地移除堆顶的元素，直到其确实出现在滑动窗口中。此时，堆顶元素就是滑动窗口中的最大值。
    为了方便判断堆顶元素与滑动窗口的位置关系，我们可以在优先队列中存储二元组
   (\textit{num}, \textit{index})(num,index)，
   表示元素 \textit{num}num 在数组中的下标为 \textit{index}index。
*/

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];//8-3+1=6
        ans[0] = pq.peek()[0];

        for (int i = k; i < n; ++i) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }
}
/**方法二：单调队列
 我们可以顺着方法一的思路继续进行优化。

 由于我们需要求出的是滑动窗口的最大值，如果当前的滑动窗口中有两个下标 i 和 j，其中 i 在 j 的左侧（i < j）
 并且 i对应的元素不大于 j 对应的元素（nums[i]≤nums[j]），那么会发生什么呢？

 当滑动窗口向右移动时，只要 i还在窗口中，那么 j一定也还在窗口中，这是 i 在 j的左侧所保证的。
 因此，由于nums[j] 的存在，nums[i] 一定不会是滑动窗口中的最大值了我们可以将nums[i] 永久地移除。

 因此我们可以使用一个队列存储所有还没有被移除的下标。在队列中，这些下标按照从小到大的顺序被存储，并且它们在数组nums 中对应的值是严格单调递减的。
 因为如果队列中有两个相邻的下标，它们对应的值相等或者递增，那么令前者为 i，后者为 j，就对应了上面所说的情况，即nums[i] 会被移除，这就产生了矛盾。

 当滑动窗口向右移动时，我们需要把一个新的元素放入队列中。
 为了保持队列的性质，我们会不断地将新的元素与队尾的元素相比较，如果前者大于等于后者，那么队尾的元素就可以被永久地移除，我们将其弹出队列。
 我们需要不断地进行此项操作，直到队列为空或者新的元素小于队尾的元素。

 由于队列中下标对应的元素是严格单调递减的，因此此时队首下标对应的元素就是滑动窗口中的最大值。
 但与方法一中相同的是，此时的最大值可能在滑动窗口左边界的左侧，并且随着窗口向右移动，它永远不可能出现在滑动窗口中了。
 因此我们还需要不断从队首弹出元素，直到队首元素在窗口中为止。

 为了可以同时弹出队首和队尾的元素，我们需要使用双端队列。满足这种单调性的双端队列一般称作「单调队列」。
*/
/*
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] ans = new int[n - k + 1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }
}
 */