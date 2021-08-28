import java.util.LinkedList;

public class LC_297 {
    public static void main(String[] args) {
        String s = "1,2,3,4,5,6,7";
        LinkedList<String> nodes = new LinkedList<>();
        //使用spilt后形成的nodes中没有“，”；
        for (String a:s.split(",")){
            nodes.add(a);
        }
    }
    public static String SEP = ",";
    public static String NUL = "#";
    public static StringBuilder sb = new StringBuilder();
    public static String des(TreeNode root){
        if (root==null){
            sb.append(NUL).append(SEP);
        }
        else
            sb.append(root.val).append(SEP);
        des(root.left);
        des(root.right);
        return sb.toString();
    }
    public static TreeNode redes(LinkedList<String> nodes){
        if (nodes.isEmpty())
            return null;
        String first = nodes.removeFirst();
        if (first==NUL)
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(first));
        root.left = redes(nodes);
        root.right = redes(nodes);
        return root;
    }
}
