import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNext()) {
            BigInteger n = scn.nextBigInteger();
            BigInteger mul = BigInteger.TEN;
            BigInteger sum = BigInteger.ZERO;
            while(n.compareTo(BigInteger.ZERO) > 0) {
              BigInteger num = n.remainder(mul);
              sum = sum.add(num);
              n = n.divide(mul);
            }
            System.out.print(sum);
        }
        scn.close();
    }
}