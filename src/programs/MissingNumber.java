package programs;

public class MissingNumber {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7};
        int n = a.length+1;
        int totalSum = n*(n+1)/2;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        int missingNum = totalSum-sum;
        System.out.println(missingNum);
    }
}