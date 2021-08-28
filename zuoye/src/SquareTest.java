
public class SquareTest {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = {
                new Square(1),
                new Circle(1),
                new Square(2),
                new Circle(2),
                new Square(3)
        };

        for (GeometricObject g:geometricObjects
             ) {
            System.out.println(g);
            if (g instanceof Colorable){
                ((Colorable) g).howToColor();
            }
            System.out.println();
        }
    }
}