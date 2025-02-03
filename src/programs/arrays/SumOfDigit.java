package programs.arrays;

public class SumOfDigit {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={10,20,30,40,50};
        int n = 23456;
        while(n!=0){
            sum+=n%10;
            n = n/10;
        }
        System.out.print(sum);
    }
}
