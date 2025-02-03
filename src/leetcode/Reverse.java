package leetcode;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        //int i=0;
        int n = arr.length;
//        int j = n-1;
//        while(i<=j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
        for(int x=0;x< n / 2;x++){
            int temp = arr[x];
            arr[x] = arr[n-(x+1)];
            arr[n-(x+1)] = temp;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+" ");
        }
        //System.out.print(arr);
    }
}
