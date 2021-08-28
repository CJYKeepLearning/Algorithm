public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public boolean isSolvable(){
        return (a*d-b*c)==0?false:true;
    }
    public double getX(){
        double x1 = e*d-b*f;
        double x2 = a*d-b*c;
        return x1/x2;
    }
    public double getY(){
        double y1 = a*f-e*c;
        double y2 = a*d-b*c;
        return y1/y2;
    }
}
