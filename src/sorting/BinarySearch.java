package sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int key = 20;
        int first = 0;
        int last = n-1;
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first = mid+1;
            } else if(arr[mid] == key){
                System.out.println("Key found at position "+mid);
                break;
            } else{
                last = mid-1;
            }
            mid = (first+last)/2;
        }
         if(first>last){
             System.out.println("Element not found");
         }
    }
}
