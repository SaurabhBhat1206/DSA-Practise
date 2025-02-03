package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {1,2,8,5,4};
        int target = 9;
        HashMap<Integer,Integer> hm= new HashMap<>();
        int idx[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){ //
                 /*
                    1. 8
                    2.
                  */
               idx[0] =  hm.get(target- nums[i]);
               idx[1] =  i;
            } else {
                hm.put(nums[i],i);//{1,0}{2,1}{8,2},{5,3},{4,4}
            }
        }
        System.out.println(Arrays.toString(idx));
    }
}
