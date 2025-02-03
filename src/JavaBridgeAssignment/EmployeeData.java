package JavaBridgeAssignment;

public class EmployeeData {
    private int eId;
    private String name;
    private int age;
    private double salary;
    private String designation;
    private String gender;
    private String department;

    public EmployeeData(int eId, String name, int age, double salary, String designation, String gender, String department) {
        this.eId = eId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.gender = gender;
        this.department = department;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
