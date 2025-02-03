package leetcode;

import java.util.HashMap;
import java.util.Map;

public class OccuranceArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,30,40,40};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        int maxFrequency = 0; int ansKey = 0;
        for(Map.Entry<Integer,Integer> data : map.entrySet()){
            if(data.getValue()>maxFrequency){
                maxFrequency = data.getValue();
                ansKey = data.getKey();
            }
        }
        System.out.println("Max Frequency "+ maxFrequency +"  "+ "Key : "+ansKey);
    }
}
