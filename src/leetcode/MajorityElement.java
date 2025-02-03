package leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,1,2,2};
        System.out.println(majorityElements(arr));

    }
    public static int majorityElements(int[] nums){
         int candiate = 0;
         int count = 0;
         for(int i=0;i<nums.length;i++){
             if(count==0){
                 candiate = nums[i];
             }
             if(candiate==nums[i]){
                 count++;
             } else {
                 count--;
             }
         }
         return candiate;
    }
}
