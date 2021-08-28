public class LC_341 {
    //扁平化嵌套列表迭代器
  // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
  /*
  public interface NestedInteger {

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
}
*/
    /**
    public class NestedIterator implements Iterator<Integer> {
        private LinkedList<NestedInteger> list;
        public NestedIterator(List<NestedInteger> nestedList) {
            list = new LinkedList(nestedList);
        }

        @Override
        public Integer next() {
            return list.remove(0).getInteger;
        }

        @Override
        public boolean hasNext() {
            //循环拆分列表元素，直到列表第一个元素是整数类型
            while(!list.isEmpty() && !list.get(0).isInteger()){
                //当列表开头第一个元素是列表类型时，进入循环
                List<NestedInteger> first = list.remove(0).getList();
                //将第一个列表打平并按顺序添加到开头
                for(int i=first.size()-1;i>=0;i--){
                    list.addFirst(first.get(i));
                }
            }
            return !list.isEmpty();
        }
        //添加到列表中
        private static void traverse(NestedInteger root,List<Integer> result){
            if(root.isInteger()){
                result.add(root.getInteger());
                return;
            }
            for(NestedInteger child:root.getList()){
                traverse(child,result);
            }
        }
    }
     **/
    public static void main(String[] args) {
        int[] nums = new int[0];
        System.out.println(nums.length);
    }
}

