package programs.arrays;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elements are "+arr[i]);
                }
            }
        }
    }
}
