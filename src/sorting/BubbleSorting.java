package sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] data = {5,2,67,23,43,99};
        int n = data.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
    }
}
