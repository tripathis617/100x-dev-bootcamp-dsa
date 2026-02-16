import java.util.Scanner;
import java.math.BigInteger;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String n = scn.nextLine();
      int l = n.length();
      int zeros = 0;
      for (int i=0; i<l; i++) {
        char c = n.charAt(i);
        if (c=='0') zeros++;
      }
      System.out.println(zeros);
    }
}