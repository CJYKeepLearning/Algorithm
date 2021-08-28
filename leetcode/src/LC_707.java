
/*public class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class MyLinkedList {
  int size;
  ListNode head;  // sentinel node as pseudo-head
  public MyLinkedList() {
    size = 0;
    head = new ListNode(0);
  }

  *//** Get the value of the index-th node in the linked list. If the index is invalid, return -1. *//*
public int get(int index) {
        // if index is invalid
        if (index < 0 || index >= size) return -1;

        ListNode curr = head;
        // index steps needed
        // to move from sentinel node to wanted index
        for(int i = 0; i < index + 1; ++i) curr = curr.next;
        return curr.val;
        }

*//** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. *//*
public void addAtHead(int val) {
        addAtIndex(0, val);
        }

*//** Append a node of value val to the last element of the linked list. *//*
public void addAtTail(int val) {
        addAtIndex(size, val);
        }

*//** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. *//*
public void addAtIndex(int index, int val) {
        // If index is greater than the length,
        // the node will not be inserted.
        if (index > size) return;

        // [so weird] If index is negative,
        // the node will be inserted at the head of the list.
        if (index < 0) index = 0;

        ++size;
        // find predecessor of the node to be added
        ListNode pred = head;
        for(int i = 0; i < index; ++i) pred = pred.next;

        // node to be added
        ListNode toAdd = new ListNode(val);
        // insertion itself
        toAdd.next = pred.next;
        pred.next = toAdd;
        }

*//** Delete the index-th node in the linked list, if the index is valid. *//*
public void deleteAtIndex(int index) {
        // if the index is invalid, do nothing
        if (index < 0 || index >= size) return;

        size--;
        // find predecessor of the node to be deleted
        ListNode pred = head;
        for(int i = 0; i < index; ++i) pred = pred.next;

        // delete pred.next
        pred.next = pred.next.next;
        }
        }*/

/*myself*/
/*
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class MyLinkedList {
    int size;
    ListNode head;
    */
/** Initialize your data structure here. *//*

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    */
/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. *//*

    public int get(int index) {
        ListNode p = head;
        ListNode pre = p,curr = p.next;
        if(index>size-1)
            return -1;
        while(index>=0){
            curr = curr.next;
            index--;
        }
        return curr.val;
    }

    */
/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. *//*

    public void addAtHead(int val) {
        ListNode a = new ListNode(val);
        a.next = head.next;
        head.next = a;
        size++;
    }

    */
/** Append a node of value val to the last element of the linked list. *//*

    public void addAtTail(int val) {
        ListNode b = new ListNode(val);
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = b;
        b.next = null;
        size++;
    }

    */
/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. *//*

    public void addAtIndex(int index, int val) {
        if(index > size - 1)
            return;
        else if(index == size - 1)
            addAtTail(val);
        else if (index<0)
            addAtHead(val);
        else{
            ListNode a = new ListNode(val);
            ListNode pre = head,curr = head.next;
            while(index--!=0){
                curr = curr.next;
                pre = pre.next;
            }
            a.next = curr;
            pre.next = a;
        }

    }

    */
/** Delete the index-th node in the linked list, if the index is valid. *//*

    public void deleteAtIndex(int index) {

    }
}

*/
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
