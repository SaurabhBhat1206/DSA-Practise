package programs.arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int arr[]= {67,987,99,54,-687,2};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            max = Math.max(arr[i],max);
//        }
//        int smx = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=max){
//                smx = Math.max(smx,arr[i]);
//            }
//        }
//        System.out.print(smx);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        System.out.println("First largest element is " + max);
        int sMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sMax = Math.max(arr[i],sMax);
        }
        System.out.println("First largest element is " + sMax);

    }

}
