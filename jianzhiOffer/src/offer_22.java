public class offer_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int len = lengthListNode(head);
        int pre = len - k;
        while (pre>=0){
            pre--;
            head = head.next;
        }
        return head;
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