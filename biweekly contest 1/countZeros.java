import java.util.*; 
import java.math.BigInteger; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      BigInteger n = scn.nextBigInteger();
      if (n.equals(BigInteger.ZERO)) {
        System.out.println(1);
        return;
      } 
      int count = 0;
      while(n.equals(BigInteger.ZERO) == false) {
        if (n.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
          count ++;
        }
        n = n.divide(BigInteger.TEN);
      }
      System.out.println(count);
  }
}