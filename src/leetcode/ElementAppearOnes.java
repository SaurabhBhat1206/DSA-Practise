package leetcode;

public class ElementAppearOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,6,6};
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }

        System.out.println(xor);
    }
}
