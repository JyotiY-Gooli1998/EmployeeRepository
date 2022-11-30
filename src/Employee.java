
public class Employee {
    private int eid;
    private String fname;
    private String lname;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(int eid, String fname, String lname, int age) {
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


}
