public class MyDoubleList {
    //使用双向链表原因：需要删除操作，所以需要其前驱结点指针
    //使用单向时每次删除都要重新遍历，而且还要求链表数据不一样，或者有其他标识的地方才能删除，非常麻烦
    private MyDoubleListNode head,tail;
    private int size;
    public MyDoubleList(){
        head = new MyDoubleListNode(0,0);
        tail = new MyDoubleListNode(0,0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    public void addLast(MyDoubleListNode x){
        x.prev = tail.prev;
        x.next = tail;
        tail.prev.next = x;
        tail.prev = x;
        size++;
    }
    public void remove(MyDoubleListNode x){
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }
    public MyDoubleListNode removeFirst(){
        if (head.next==tail)
            return  null;
        //如果直接断开，就找不到x了，所以先用一个first指向它
        MyDoubleListNode first = head.next;
        remove(first);
        return first;
    }
    public int size(){return size;}
}
class MyDoubleListNode{
    public int key,val;
    public MyDoubleListNode next,prev;
    public MyDoubleListNode(int k,int v){
        this.key = k;
        this.val = v;
    }
}
