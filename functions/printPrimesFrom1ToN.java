import java.util.Scanner;
import java.math.BigInteger;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      for (int i=2; i<=n; i++) {
        func(i);
      }
    }
    
    public static void func(int n) {
      boolean prime = true;
      for (int i=2; i<=n/2; i++) {
        if (n%i==0) {
          prime = false;
        }
      }
      if (prime) {
        System.out.print(n + " "); 
      }
    }
}