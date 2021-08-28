import java.util.Stack;

public class LC_232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
    }
}
class MyQueue {
    private Stack<Integer> stack1 = new Stack();
    private Stack<Integer> stack2 = new Stack();
    /** Initialize your data structure here. */
    public MyQueue() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(x);
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int element=0;
        if (!stack2.isEmpty()){
            element = stack2.pop();
        }
            return element;
    }

    /** Get the front element. */
    public int peek() {
        int element=0;
        element =stack2.peek();
        return element;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (stack2.isEmpty())
            return true;
        else
            return false;
    }
}
