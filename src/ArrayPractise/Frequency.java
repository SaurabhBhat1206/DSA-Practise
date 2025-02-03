package ArrayPractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        HashMap<Integer,Integer> hp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hp.containsKey(arr[i])){
                hp.put(arr[i],hp.get(arr[i])+1);
            } else {
                hp.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : hp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
