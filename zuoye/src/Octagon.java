public class Octagon extends GeometricObject implements Comparable,Cloneable {
    private double length;
    private double area;
    private double perimeter;
    public Octagon(){
        length=1.0;
        setPerimeter();
        setArea();
    }
    public Octagon(double length){
        this.length = length;
        setPerimeter();
        setArea();
    }
    private void setArea(){
        area = length*length*(2+2*Math.sqrt(2));
    }
    @Override
    public double getArea() {
        return area;
    }
    private void setPerimeter(){
        perimeter = length*8;
    }
    public double getPerimeter(){
        return perimeter;
    }

    @Override
    public int compareTo(Object o) {
        return (int)(this.getArea()-((Octagon)o).getArea());
    }
    public Object clone(){
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Octagon{" +
                "length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
