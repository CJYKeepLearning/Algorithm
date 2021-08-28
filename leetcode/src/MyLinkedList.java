public class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList(){
        size =0;
        head = new ListNode(0);
    }
    public int get(int index){
        if(index<0 || index>=size) return -1;

        ListNode curr = head;
        while (index--!=-1)
            curr = curr.next;
        return curr.val;
    }
    public void addAtHead(int val){
        ListNode a = new ListNode(val);
        a.next = head.next;
        head.next = a;
        size++;
    }
    public void addAtTail(int val){
        ListNode b = new ListNode(val);
        ListNode curr = head;
        while (curr.next!=null)
            curr = curr.next;
        curr.next = b;
        size++;
    }
    public void addAtIndex(int index,int val){
        if(index>size) return;
        if (index < 0) index = 0;size++;
        ListNode pred = head;
        for (int i=0;i<index;i++)
            pred = pred.next;
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }
    public void deleteAtIndex(int index){
        if (index<0 || index>=size) return;
        size--;
        ListNode pred = head;
        for (int i = 0;i<index;i++)
            pred = pred.next;
        pred.next = pred.next.next;
    }
}
class ListNode{
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
}
