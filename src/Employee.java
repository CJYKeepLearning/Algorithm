public class Employee extends Person{
    protected String office;
    protected double wage;
    protected MyDate date_of_employment;

    public Employee() {
        date_of_employment = new MyDate();
    }
    public Employee(String name,String office,double wage) {
        super(name);
        this.office = office;
        this.wage = wage;
        date_of_employment = new MyDate();
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public MyDate getDate_of_employment() {
        return date_of_employment;
    }
    public String toString() {
        return "类别为员工，人名为："+getName();
    }
}
