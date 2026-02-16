import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNext()) {
            BigInteger x = scn.nextBigInteger();
            int n = scn.nextInt();
            BigInteger pow = x.pow(n);
            
            System.out.println(pow);
        }
        scn.close();
    }
}