import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=1;
        for (int i=1; i<=2*n-1; i++) {
          for (int j=1; j<=star; j++) {
            if (j==1 || j==star) {
              System.out.print("* "); 
            } else {
              System.out.print("  "); 
            }
          } 
          if (i<n) {
            star++;
          } else {
            star--;
          } 
          System.out.println();
        } 
    }
}