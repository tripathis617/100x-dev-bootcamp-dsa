import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n==1) {
          System.out.println("Not Prime");
          return;
        }
        boolean isPrime = true;
        for (int i=2; i<=n/2; i++) {
          if (func(i, n)) {
            isPrime = false;
          }
        }
        if (isPrime) {
          System.out.println("Prime");
        } else {
          System.out.println("Not Prime");
        }
    }
    
    public static boolean func(int d, int n) {
      return n%d==0;
    }
}