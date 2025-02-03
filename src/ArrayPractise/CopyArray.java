package ArrayPractise;

public class CopyArray {
    static int add(int a,int b,int c){
        return a+b+c;
    }

    static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        add(10,20);
        add(20.2,30.5);
    }
}

