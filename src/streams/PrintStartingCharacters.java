package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintStartingCharacters {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Sam", "Mary", "John", "Peter", "Sam", "Mary"};
        char startingChar = 'J';
//        for (String name : names) {
//            if(name.charAt(0) == 'J')
//            System.out.println(name);
//        }
        Arrays.stream(names).filter(word -> word.startsWith("J"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
