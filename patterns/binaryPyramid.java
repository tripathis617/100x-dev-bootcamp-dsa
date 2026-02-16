import java.util.Scanner;
import java.math.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNext()) {
            int n = scn.nextInt();
            // int m = scn.nextInt();
            int num = 0;
            for (int i=1; i<=n; i++) {
              if (i%2==0) {
                num =1;
              } else {
                num =0;
              }
              for (int j=1; j<=n; j++) {
                if (j<=i) {
                  System.out.print(num);
                } else {
                  System.out.print("");
                }
                num ^= 1;
              }
              System.out.println();
            } 
        }
        scn.close();
    }
}