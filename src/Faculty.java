public class Faculty extends Employee{
    private int office_hours;
    private String rank;

    public Faculty(String name,String office,double wage,int office_hours, String rank) {
        super(name,office,wage);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public int getOffice_hours() {
        return office_hours;
    }
    public void setOffice_hours(int office_hours) {
        this.office_hours = office_hours;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString() {
        return "类别为教员，人名为："+getName();
    }
}
