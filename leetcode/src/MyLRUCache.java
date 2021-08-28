import java.util.HashMap;

public class MyLRUCache {
    private HashMap<Integer,MyDoubleListNode> map;
    private MyDoubleList cache;
    private int cap;
    public MyLRUCache(int capcity){
        map = new HashMap<>();
        this.cap = capcity;
        cache = new MyDoubleList();
    }
    private void makeRecently(int key){
        MyDoubleListNode x = map.get(key);
        cache.remove(x);
        cache.addLast(x);
    }
    public void addRecently(int key,int val){
        MyDoubleListNode x = new MyDoubleListNode(key,val);
        cache.addLast(x);
        map.put(key,x);
    }
    private void deleteKey(int key){
        map.remove(key);
        MyDoubleListNode x = map.get(key);
        cache.remove(x);
        cap--;
    }
    //在链表中同时存储key和val原因，需要在cache移除后得到其key值
    //同时移除最久未使用元素时返回结点的原因也是这个
    private void removeLeastRecently(){
        MyDoubleListNode x = cache.removeFirst();
        int deletedKey = x.key;
        map.remove(deletedKey);
    }
    //get
    public int get(int key){
        if (!map.containsKey(key))
            return -1;
        makeRecently(key);
        return map.get(key).val;
    }
    //put方法
    public void put(int key,int val){
        if (map.containsKey(key)) {
            deleteKey(key);
            addRecently(key, val);
            return;
        }
        if (cap==cache.size()){
            removeLeastRecently();
        }
        addRecently(key,val);
    }
}
