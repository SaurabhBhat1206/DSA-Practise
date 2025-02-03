package ArrayPractise;

import java.util.Arrays;

public class MoveZeroEnd {

    public static void main(String[] args) {
        int a[] = {0,1,0,3,12};
        moveZero(a);
        System.out.println(Arrays.toString(a));

    }

    public static void moveZero(int nums[]){
        int numPosition = nums.length-1;
        for(int i=nums.length-1 ; i>=0;i--){
            if(nums[i]!=0){
                nums[numPosition] = nums[i];
                numPosition--;
                // 3
            }
        }
        while(numPosition!=0){
            nums[numPosition--] = 0;
        }
    }
}
