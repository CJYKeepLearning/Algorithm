public class offer_22 {
    public ListNode getKthFromEnd1(ListNode head, int k) {
        int len = lengthListNode(head);
        int pre = len - k;
        while (pre>=0){
            pre--;
            head = head.next;
        }
        return head;
    }
    //双指针--快慢指针
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        while (k>1){
            k--;
            fast = fast.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public int lengthListNode(ListNode head){
        int i=0;
        while (head.next!=null){
            i ++ ;
            head = head.next;
        }
        return i;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}