import java.util.Scanner;
import java.math.BigInteger;

public class Functions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        BigInteger sum = BigInteger.ONE;
        for (int i=2; i<=n; i++) {
          sum = func(BigInteger.valueOf(i), sum);
        }
        System.out.println(sum);
    }
    
    public static BigInteger func(BigInteger num, BigInteger sum) {
      return sum.multiply(num);
    }
}