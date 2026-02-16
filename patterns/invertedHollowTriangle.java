import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=n;
        int space=0;
        for (int i=1; i<=n; i++) {
          for (int j=1; j<=space; j++) {
            System.out.print(" ");
          }
          for (int j=1; j<=star; j++) {
            if (i==1 || i==n || j==1 || j==star) {
              if (j!=star) {
                System.out.print("* ");
              } else {
                System.out.print("*");
              }
            } else {
              System.out.print("  "); 
            }
          }
          star--;
          space++; 
          System.out.println();
        } 
    }
}