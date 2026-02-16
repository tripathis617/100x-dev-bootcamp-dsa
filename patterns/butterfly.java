import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=1;
        int space=2*n-2;
        for (int i=1; i<=2*n-1; i++) {
          for (int j=1; j<=star; j++) {
            System.out.print("*"); 
          }
          for (int j=1; j<=space; j++) {
            System.out.print(" ");
          }
          for (int j=1; j<=star; j++) {
            System.out.print("*"); 
          }
          if (i<n) {
            star++;
            space-=2; 
          } else {
            star--;
            space+=2;
          }
          System.out.println();
        } 
    }
}