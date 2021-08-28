public class Square extends GeometricObject implements Colorable{
    private double length;
    private double area;
    public Square() {
    }
    public Square(double length) {
        this.length = length;
         area = length*length;
    }
    public double getArea(){
        return area;
    }
    public void howToColor(){
        System.out.println("Color all four sides");
    }
    public String toString(){
        return "Square's area is:"+getArea();
    }
}
