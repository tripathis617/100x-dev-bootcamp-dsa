import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNext()) {
            String str = scn.nextLine();
            str = str.trim();
            int l = str.length();
            boolean pal = true;
            for (int i=0; i<l/2; i++) {
              char s = str.charAt(i);
              char e = str.charAt(l-i-1);
              if (s != e) {
                pal = false;
              }
            }
            if (pal) {
              System.out.println("YES");  
            } else {
              System.out.println("NO");
            }
            
        }
        scn.close();
    }
}