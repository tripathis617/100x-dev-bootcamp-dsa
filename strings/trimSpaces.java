import java.util.*;

public class Strings {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str1 = scn.nextLine();
      int n = str1.length();
      StringBuilder res = new StringBuilder();
      for (int i=0; i<n; i++) {
        char c = str1.charAt(i);
        if (c != ' ') {
          res.append(c);
        }
      }
      System.out.println(res);
    }
}