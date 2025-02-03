package streams;

import java.util.stream.Collectors;

public class FirstRepeatedCharacters {

    public static void main(String[] args) {
        String str = "Java Stream API is very good concept";
//        char[] charArray = str.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = i + 1; j < charArray.length; j++) {
//                if (charArray[i] == charArray[j]) {
//                    System.out.println("First Repeated Character is: " + charArray[i]);
//                    return;
//                }
//            }
//        }
        Character key = str.chars().mapToObj(ch->(char) ch)
                .filter(ch-> ch!=' ')
                .collect(Collectors.groupingBy(ch->ch, Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1).findFirst().get().getKey();
        System.out.println(key);
    }
}
