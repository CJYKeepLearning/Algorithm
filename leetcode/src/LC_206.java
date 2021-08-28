class ListNode206{
    int val;
    ListNode206 next;

    public ListNode206(int val) {
        this.val = val;
    }

    public ListNode206(int val, ListNode206 next) {
        this.val = val;
        this.next = next;
    }
}
/*public class LC_206 {
    public ListNode206 reverseList(ListNode206 head){
        ListNode206 rever = new ListNode206(0);
        ListNode206 p = head;
        while (p!=null){
            add(p.val,rever);
            p = p.next;
        }
        return rever.next;

    }
    public void add(int val,ListNode206 head){
        ListNode206 toAdd = new ListNode206(val);
        toAdd.next = head.next;
        head.next = toAdd;
    }
}*/
public class LC_206 {
    public static ListNode206 reverseList(ListNode206 head){
        ListNode206 temp;
        ListNode206 curr = head;
        ListNode206 pre = null;
        /**Key**/
        while (curr!=null){
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        printList(pre);
        return pre;
    }
    public static void add(int val){
        ListNode206 b = new ListNode206(val);
        b.next = head.next;
        head.next = b;
    }
    public static void printList(ListNode206 head){
        ListNode206 curr = head;
        while (curr!=null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
    static ListNode206 head = new ListNode206(0);
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        printList(head);
        System.out.println("end");
        reverseList(head);
    }
}


