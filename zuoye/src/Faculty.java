public class Faculty extends Employee{
    private int office_hours;
    private String rank;

    public Faculty(String name,String address,String phone,String email,String office,double wage,int office_hours, String rank) {
        super(name,address,phone,email,office,wage);
        this.office_hours = office_hours;
        this.rank = rank;
    }
    public String toString() {
        return "类别为教员，人名为："+name;
    }
}
