public class Fan {
    public static void main(String[] args) {
        Fan first = new Fan();
        first.setSpeed(Fan.FAST);
        first.setRadius(10);
        first.setColor("yellow");
        first.setOn(true);

        Fan second = new Fan();
        second.setSpeed(Fan.MEDIUM);
        second.setRadius(5);
        second.setOn(false);

        System.out.println(first.toString());
        System.out.println(second.toString());
    }
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){
    }

    @Override
    public String toString() {
        return "Fan{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", FAST=" + FAST +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
