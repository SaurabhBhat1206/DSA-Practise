package cloudTech;

public class Factorial {
    static int fact = 1;
    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factRec(6));
    }
    public static int factorial(int n){
         for(int i=1;i<=n;i++){
             fact = fact * i;
         }
         return fact;
    }

    public static int factRec(int n){
        if(n==0){
            return 1;
        } else {
            return n * factRec(n-1);
        }
    }
}
