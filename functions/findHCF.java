import java.util.Scanner;
import java.math.BigInteger;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int small = n<m?n:m;
      int max = 1;
      for (int i=2; i<=small; i++) {
        if (func(i, n) && func(i, m) && max < i) {
          max = i;
        } 
      }
      System.out.println(max);
    }
    
    public static boolean func(int i, int n) {
      return n%i==0;
    }
}