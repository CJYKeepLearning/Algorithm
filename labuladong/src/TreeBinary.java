import java.beans.BeanInfo;

public class TreeBinary {
    //exchange left and Child
public static BinNode invertTree(BinNode root){
    if (root == null) return null;
    BinNode newLeft = invertTree(root.right);
    BinNode newRight = invertTree(root.left);
    root.left = newLeft;
    root.right = newRight;
    return root;
}

    //print
public static void print(BinNode root){
    BinNode tmp = root;
    if (root!=null)
        System.out.println(root.data);
    else
        return;
    print(root.left);
    print(root.right);
}

    public static void main(String[] args) {
        BinNode root = new BinNode(4);
        root.left = new BinNode(2);
        root.right = new BinNode(7);
        root.left.left = new BinNode(1);
        root.left.right = new BinNode(3);
        root.right.left = new BinNode(6);
        root.right.right= new BinNode(9);
        print(root);
        invertTree(root);
        print(root);
    }

}
class BinNode{
    int data;
    BinNode left;
    BinNode right;
    public BinNode(){}
    public BinNode(int data){
        this.data = data;
    }
}
