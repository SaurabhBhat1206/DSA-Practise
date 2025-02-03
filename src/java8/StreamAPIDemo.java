package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(10);
        list.add(18);
        list.add(19);
        list.add(7);
        list.add(11);
        list.add(25);
        System.out.println(list);

        List l1 = list.stream().filter((x)->x%2==0).collect(Collectors.toList());
        System.out.println(l1);

        List l2 = list.stream().map((x)->x+x).collect(Collectors.toList());
        System.out.print(l2);
    }
}
