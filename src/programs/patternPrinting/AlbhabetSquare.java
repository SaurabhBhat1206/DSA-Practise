package programs.patternPrinting;

import java.util.Scanner;

public class AlbhabetSquare {
    public static void main(String[] args) {
        System.out.println("Enter the n");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((j+64)+" ");
            }
            System.out.println();
        }
    }
}
