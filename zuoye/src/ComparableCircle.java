public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius){
        super(radius);
    }
    public int compareTo(ComparableCircle o) {
            return this.getArea()>o.getArea()?1:this.getArea()== o.getArea()?0:-1;
    }
}
