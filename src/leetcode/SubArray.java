package leetcode;

public class SubArray {
    public static void main(String[] args) {
        int[] ar = {5,1,2,4,9,3,1,3,3};
        int size = 3;
        int i;
        int j;
        int count=0;

        for(i=0;i<ar.length-size;i++){
            for(j=i;j<i+size;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
            count++;
        }
        System.out.println(count);

    }
}
