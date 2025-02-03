package leetcode;

public class
RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+" ");
        }
    }
    public static void rotate(int nums[],int k){
//       int n = nums.length;
//       k = k%n;
//       revese(nums,0,n-k-1);
//       revese(nums,n-k,n-1);
//       revese(nums,0,n-1);
        int n = nums.length;
        k = k%n;
        revese(nums,0,n-1);
        revese(nums,0,k-1);
        revese(nums,k,n-1);
    }
    public static void revese(int nums[],int start,int end){
//        while(i<=j){
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i++;
//            j--;
//        }

        while(start<=end){
            int temp =  nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
