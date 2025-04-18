package MD_Saif_Ahmed_Shishir;

public class Employee {
    private String name;
    private int id;
    private String dept;
    private String desig;
    private int salary;

    public Employee(String name, int id, String dept, String desig, int salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.desig = desig;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }
}
