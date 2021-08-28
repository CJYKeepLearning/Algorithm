import java.util.List;

public class reverseLinkList {
    //reverse LinkList
    public static Node reverse(Node headNode){
        if (headNode.getNext()==null)
            return headNode;
        Node last = reverse(headNode.getNext());
        headNode.getNext().setNext(headNode);
        headNode.setNext(null);
        return last;
    }
    //reverse N Node
    static Node succesor = null;
    public static Node reverseN(Node head,int n){
        if (n==1){
            succesor = head.getNext();
            return head;
        }
        Node last = reverseN(head.getNext(),n-1);
        head.getNext().setNext(head);
        head.setNext(succesor);
        return last;
    }
    //reverse n-m Node
    public static Node reverseMN(Node head,int m,int n){
        if (m==1)
             return reverseN(head,n);
        head.setNext(reverseMN(head.getNext(),m-1,n-1));
        return head;
    }

    //reverse 以k为一组的链表
    //反转[a,b)链表
    public static Node reverseAB(Node a,Node b){
        Node pre,cur,nxt;
        pre = null;
        cur = a;
        nxt = a;
        while (cur!=b){
            nxt = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
    public static Node reverseK(Node head,int k){
        if (head==null) return null;
        Node a,b;
        a=b=head;
        for (int i=0;i<k;i++){
            if (b==null)    return head;    //如果少于k个。
            b=b.getNext();
        }
        Node newHead = reverseAB(a,b);
        a.setNext(reverseK(b,k));
        return newHead;
    }
    //print
    public static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    //createLinkList
    public static void createLinkList(Node head,int[] data){
        Node temp = head;
        for (int i=1;i<data.length;){
            temp.setData(data[i]);
            if (++i>=data.length)
                break;
            else {
                Node nextNode = new Node();
                temp.setNext(nextNode);
                temp = temp.getNext();
            }
        }
    }
    public static void main(String[] args) {
        int[] data = {0,1,2,3,4,5,6};
        Node head = new Node();
        createLinkList(head,data);
        print(head);
        //print(reverse(head));
        //print(reverseN(head,3));
        //print(reverseMN(head,2,4));
        print(reverseK(head,4));
    }
}
class Node{
    private int data;
    private Node next;
    public Node(){}
    public Node(int data){
        this.data = data;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node node){
        this.next = node;
    }
    public Node getNext(){
        return next;
    }
}
