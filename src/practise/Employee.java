package practise;

import java.util.Objects;

public class Employee {
    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(10);
        e1.setName("saurabh");

        Employee e2= new Employee();
        e2.setId(10);
        e2.setName("saurabh");

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }

}
