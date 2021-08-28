class OctagonTest {
    public static void main(String[] args) {
        Octagon o1 = new Octagon(5);
        Octagon o2 = (Octagon) o1.clone();
        System.out.println(o1);
        System.out.println(o1.compareTo(o2));
    }
}