package leetcode;

import java.util.Arrays;

public class MergeSortedArrayWithoutNewArray {
    public static void main(String[] args) {
       int nums1[] = {1,2,3,0,0,0};
       int nums2[] = {2,3,5};
       int m=3;
       int n=3;
       mergeArrays(nums1,nums2,m,n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeArrays(int num1[],int num2[],int m, int n ){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && num1[i] > num2[j]){
                num1[k] = num1[i];
                k--;
                i--;
            } else {
                num1[k] = num2[j];
                k--;
                j--;
            }
        }
    }
}
