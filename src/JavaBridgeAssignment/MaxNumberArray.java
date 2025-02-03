package JavaBridgeAssignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNumberArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,58,69,85,74,25,36);
        Optional<Integer> opt = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst();
        System.out.println(opt.get());

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
            if(list.get(i)!=max){
                secondMax=Integer.max(secondMax,list.get(i));
            }
        }
        System.out.println(secondMax);

    }
}
