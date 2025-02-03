package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumPractise {

    public static void main(String[] args) {
       int[] nums = {2,7,5,2,3,1};
       int[] idx = new int[2];
       int target = 9;
       HashMap<Integer,Integer> hp = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           if(hp.containsKey(target-nums[i])){
               idx[0] = hp.get(target-nums[i]);
               idx[1] = i;
           } else {
               hp.put(nums[i],i);
           }
       }
       System.out.print(Arrays.toString(idx));
    }
}
