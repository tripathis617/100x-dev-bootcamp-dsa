import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int n = scn.nextInt();
      for (int i=0; i<n; i++)  { 
        for (int k=0; k<i; k++) {
            System.out.print(" ");  
        }
        for (int j=0; j<n; j++)  {
          if (j<=i) {
            System.out.print("x"); 
          }
        }
        System.out.println();
      }
  }
}