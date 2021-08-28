public class Circle extends GeometricObject{
    private double radius;
    private double area;
    public Circle (){
        this(1.0);
    }
    public Circle (double newRadius){
        this.radius = newRadius;
        area = radius*radius*3.14159;
    }
    public double getArea(){
        return area;
    }
    public String toString(){
        return "Circle's area is:"+getArea();
    }
}
