/*public class LC_142 {
    public ListNode142 detectCycle(ListNode142 head) {
        if(head.next == null)
            return null;
        ListNode142 p = head,p2 = head;
        boolean hasCycle = false;
        while (p2.next != null && p2.next.next != null){
            p = p.next;
            p2 = p2.next.next;
            if(p == p2){
                hasCycle = true;
                break;
            }
        }
        if(hasCycle){
            ListNode142 q = head;
            while (p!=q){
                p = p.next;
                q = q.next;
            }
            return q;
        }else
            return null;

    }
}*/
public class LC_142 {
    public ListNode142 detectCycle(ListNode142 head) {
        ListNode142 fast = head;
        ListNode142 slow = head;
        boolean hasCycle = false;
        while (fast!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                hasCycle = true;
                break;
            }
        }
        if (hasCycle){
            ListNode142 curr = head;
            while (curr != slow){
                curr = curr.next;
                slow = slow.next;
            }
            return curr;
        }
        return null;
    }
}
class ListNode142{
    int val;
    ListNode142 next;

    public ListNode142() {
    }

    public ListNode142(int val) {
        this.val = val;
        this.next = null;
    }
}
