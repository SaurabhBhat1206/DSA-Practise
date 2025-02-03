package cloudTech;

import java.util.HashMap;
import java.util.Map;

public class CountOfElement {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,30,50,60,40,20};
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            } else {
                hmap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry  : hmap.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
