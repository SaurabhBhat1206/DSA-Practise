package practise;

public class EmpCloningImmutable implements Cloneable {
    private final int age;
    private final int eid;
    private final String name;

     EmpCloningImmutable() {
        eid = 101;
        age = 34;
        name = "saurabh";
    }

    public EmpCloningImmutable(int age, int eid, String name) {
        this.age = age;
        this.eid = eid;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmpCloningImmutable{" +
                "age=" + age +
                ", eid=" + eid +
                ", name='" + name + '\'' +
                '}';
    }

    public EmpCloningImmutable clone() {
        try {
            return (EmpCloningImmutable) super.clone();

        } catch (Exception ex) {
            System.out.println("Exception occured" + ex.getMessage());
        }
        return null;
    }
}

