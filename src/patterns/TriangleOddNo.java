package patterns;

public class TriangleOddNo {
    public static void main(String[] args) {
        /*
        1
        1 3
        1 3 5
        1 3 5 7
         */
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((2*j)-1 + " ");
            }
            System.out.println();
        }
    }
}
