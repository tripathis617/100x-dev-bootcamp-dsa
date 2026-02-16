import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i=n; i>=2; i--) {
          if (func(i, n)) {
            System.out.print(i + " ");
          }
        }
        System.out.print(1);
    }
    
    public static boolean func(int d, int n) {
      return n%d==0;
    }
}