import java.util.*;

public class Main {
    public static void main(String[] args){
        boolean a = false;
        boolean b = true;
        boolean c = true;
        System.out.println(a|b&c);
    }

}
abstract class A{
    abstract float getFloat();
    void f(){}
}
class B extends A{

    float getFloat() {
        return 0;
    }
}