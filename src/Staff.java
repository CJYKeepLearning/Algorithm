public class Staff extends Employee {
    private String title;

    public Staff(String name,String office,double wage,String title) {
        super(name,office,wage);
        this.title = title;
    }
    public String toString() {
        return "类别为职员，人名为："+getName();
    }
}
