import java.util.*;

public class Strings {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      int n = str.length();
      StringBuilder res = new StringBuilder();
      for (int i=0; i<n; i++) {
        int ch = (int) str.charAt(i);
        if (ch >= 65 && ch <= 90) {
          ch+=32;
        } else if (ch >= 97 && ch <= 122) {
          ch-=32;
        }
        res.append((char)ch);
      }
      System.out.println(res);
    }
}