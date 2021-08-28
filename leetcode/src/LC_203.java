import java.util.List;
class ListNode203{
    int val;
    ListNode203 next;
    ListNode203(){}
    ListNode203(int val){
        this.val = val;
    }
    ListNode203(int val,ListNode203 next){
        this.val = val;
        this.next = next;
    }
}
/**构造一个虚拟节点**/
public class LC_203 {
    public ListNode203 removeElements(ListNode203 head,int val){
        ListNode203 p = new ListNode203(0,head);
        ListNode203 pre = p,curr = head;
        while (curr!=null){
            if (curr.val == val){
                pre.next = curr.next;
            }else pre = curr;
            curr = curr.next;
        }
        return p.next;
        }
}
/* first
public class LC_203{
    public ListNode203 removeElements(ListNode203 head,int val){
        ListNode203 p = new ListNode203(0,head);
        ListNode203 pre = p;
        ListNode203 curr = head;
        while (curr!=null){
            if (curr.val == val){
                pre.next = curr.next;
            }else
                pre = curr;
            curr = curr.next;
        }
        return p.next;
    }
}*/
