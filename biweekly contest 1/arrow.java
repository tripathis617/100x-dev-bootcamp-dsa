import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=1;
        int space=0;
        for (int i=1; i<=2*n-1; i++) {
          for (int j=1; j<=space; j++) {
            System.out.print(" ");
          }
          for (int j=1; j<=star; j++) {
            if (i==1 || i==2*n-1 || j==1 || j==star) {
              if (j!=star) {
                System.out.print("> "); 
              } else {
                System.out.print(">");
              }
            } else {
              System.out.print("  ");
            }
          }
          if (i<n) {
            star++; 
            space++; 
          } else {
            star--; 
            space--;
          }
          System.out.println();
        } 
    }
}