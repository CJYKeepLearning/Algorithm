import java.util.LinkedList;

public class palindRome {
    public static void main(String[] args) {
    }
    public static void traverse(Node node){
        //如果使用前序遍历则将代码块放到这里
        traverse(node.getNext());
        //如果使用后序遍历则将代码块放到这里
    }
    //slow fast指针
    public static void searchMid(Node head){
        Node slow,fast;
        slow = fast = head;
        while (fast!=null && fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
    }
    Node reverseTwo(Node head){
        Node pre,cur,nxt;
        pre = null;
        cur = head;
        nxt = cur.getNext();
        while (cur!=null){
            nxt = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

}
