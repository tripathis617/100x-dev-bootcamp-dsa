import java.util.Scanner;
import java.math.BigInteger;

public class Functions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int num = func(n);
        int den = func(r)*func(n-r);
        System.out.println(num/den);
    }
    
    public static int func(int n) {
      int sum = 1;
      for (int i=2; i<=n; i++) {
        sum *= i;
      }
      return sum;
    }
}