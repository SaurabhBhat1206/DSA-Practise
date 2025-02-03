package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n= 5;
        System.out.print(factorial(n));
    }

    private static int factorial(int n) {
          if(n<=1){
              return 1;
          } else {
             return n * factorial(n-1);
          }
    }
}
