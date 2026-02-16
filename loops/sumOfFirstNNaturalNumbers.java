import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger sum = BigInteger.ZERO;
        if (scn.hasNext()) {
            int n = scn.nextInt();
            for (int i = 1; i <= n; i++) {
                BigInteger num =  BigInteger.valueOf(i);
                sum = sum.add(num);
            }
            System.out.println(sum);
        }
        scn.close();
    }
}