import java.util.*;

public class Strings {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      int c = (int)str.charAt(0);
      if (c>=65 && c<=90) {
        c+=32;
      }
      System.out.println((char)c);
    }
}