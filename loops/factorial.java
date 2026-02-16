import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger fact = BigInteger.ONE;
        if (scn.hasNext()) {
            int n = scn.nextInt();
            for (int i = 1; i <= n; i++) {
                BigInteger num =  BigInteger.valueOf(i);
                fact = fact.multiply(num);
            }
            System.out.println(fact);
        }
        scn.close();
    }
}