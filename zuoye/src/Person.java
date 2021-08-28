public class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "类别为人，人名为："+name;
    }
}
class Employee extends Person{
    protected String office;
    protected double wage;
    protected MyDate date_of_employment;

    public Employee(String name,String address,String phone,String email,String office,double wage) {
        super(name,address,phone,email);
        this.office = office;
        this.wage = wage;
        date_of_employment = new MyDate();
    }
    public String toString() {
        return "类别为员工，人名为："+this.name;
    }
}
class Student extends Person {
    private int class_status;
    public final static int FRESHMAN=1;//大一新生
    public final static int SOPHOMORE=2;//大二学生
    public final static int JUNIOR=3;//大三学生
    public final static int SENIOR=4;//大四学生

    public Student(String name,String address,String phone,String email,int class_status){
        super(name,address,phone,email);
        this.class_status = class_status;
    }
    public String toString() {
        return "类别为学生，人名为："+this.name;
    }
}
class Staff extends Employee {
    private String title;

    public Staff(String name,String address,String phone,String email,String office,double wage,String title) {
        super(name,address,phone,email,office,wage);
        this.title = title;
    }
    public String toString() {
        return "类别为职员，人名为："+this.name;
    };
}


