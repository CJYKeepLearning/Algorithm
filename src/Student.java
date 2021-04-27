public class Student extends Person {
    private String class_status;
    public final static String freshman  = "freshman";
    public final static String sophomore =  "sophomore";
    public final static String junior = "junior";
    public final static String senior = "senior";

    public Student(String name,String address,String phone,String email,String class_status){
        super(name,address,phone,email);
        this.class_status = class_status;
    }
    public String getClass_status() {
        return class_status;
    }
    public void setClass_status(String class_status) {
        this.class_status = class_status;
    }
    public String toString() {
        return "类别为学生，人名为："+getName();
    }
}
