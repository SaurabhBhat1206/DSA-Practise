package programs;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {10,3,4,1,3,4};
        int smallest = arr[0];
        for(int items : arr){
            //10>10
            //10>3
            //3>4
            //3>1

           if(smallest > items){
               smallest = items;
           }
        }
        System.out.print(smallest);
    }
}
