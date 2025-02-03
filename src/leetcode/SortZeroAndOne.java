package leetcode;

import java.util.Arrays;

public class SortZeroAndOne {
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,1,1,0,1,2};
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            } else if(arr[i] == 1){
                one++;
            } else if(arr[i] == 2){
                two++;
            }
        }

        for(int i=0;i<zero;i++)
            arr[i] = 0;
        for(int i=zero;i<(one+two);i++)
            arr[i] = 1;
        for(int i= (one+two); i<arr.length;i++)
            arr[i] = 2;

        System.out.println(Arrays.toString(arr));
    }
}
