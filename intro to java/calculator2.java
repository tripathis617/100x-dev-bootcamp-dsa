import java.util.*;
import java.math.BigInteger; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      BigInteger n = scn.nextBigInteger();
      BigInteger m = scn.nextBigInteger();
      System.out.println(n + " + " + m + " = " + n.add(m));
      System.out.println();
      System.out.println(n + " - " + m + " = " + n.subtract(m));
      System.out.println();
      System.out.println(n + " * " + m + " = " + n.multiply(m));
      System.out.println();
      System.out.println(n + " / " + m + " = " + n.divide(m));
      System.out.println();
      System.out.println(n + " % " + m + " = " + n.mod(m));
  }
}