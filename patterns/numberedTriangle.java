import java.util.Scanner;
import java.math.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNext()) {
            int n = scn.nextInt();
            // int m = scn.nextInt();
            for (int i=1; i<=n; i++) {
              for (int j=1; j<=n; j++) {
                if (j<=i) {
                  System.out.print(i);
                } else {
                  System.out.print("");
                }
              }
              System.out.println();
            } 
        }
        scn.close();
    }
}