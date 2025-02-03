package comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> st = new LinkedHashSet<>();
//        List<Student> students = Arrays.asList(
//                new Student("Bob", 22),
//                new Student("Alice", 20),
//                new Student("Charlie", 21)
//        );

        TreeSet<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("Alice", 22));
        studentSet.add(new Student("Bob", 20));
        studentSet.add(new Student("Charlie", 21));

                st.add("Prashanth");
                st.add("saurabh");
                st.add("Bhat");
                st.add("Prajwala");
                st.add("Sankarsh");


        System.out.println(st);


        //Collections.sort(studentSet); // Uses compareTo
        System.out.println(studentSet);
    }
}
