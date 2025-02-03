package ArrayPractise;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8};
        System.out.println(searchInsert(arr,3));

    }

    public static int searchInsert(int nums[], int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid]>target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}
