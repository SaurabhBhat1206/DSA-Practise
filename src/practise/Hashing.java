package practise;

import java.util.HashSet;
import java.util.Objects;

public class Hashing {
    public static void main(String[] args) {
        Student s1 = new Student(1,"saurabh");
        Student s2 = new Student(1,"Ravi");
        Student s3 = new Student(3,"Suraj");
        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.print(students.size());

    }
}

class Student{
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}
