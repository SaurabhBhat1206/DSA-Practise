package programs;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int sum = 0;
        int i=0;
        while (i<arr.length){
            sum = sum+arr[i];
            i++;
        }
        System.out.print(sum);
    }
}
