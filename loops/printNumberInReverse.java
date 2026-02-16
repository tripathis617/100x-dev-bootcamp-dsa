import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNext()) {
            BigInteger n = scn.nextBigInteger();
            BigInteger mul = BigInteger.TEN;
            BigInteger res = BigInteger.ZERO;
            if (n.compareTo(BigInteger.ZERO) == 0) {
              System.out.print(0);
            }
            while(n.compareTo(BigInteger.ZERO) > 0) {
              BigInteger num = n.remainder(mul);
              System.out.print(num);
              n = n.divide(mul);
            }
        }
        scn.close();
    }
}