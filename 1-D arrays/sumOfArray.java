import java.util.Scanner;
import java.math.BigInteger;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i=0; i<n; i++) {
         arr[i] = scn.nextInt();
      }
      func(arr);
    }
    
    public static void func(int[] arr) {
      int n = arr.length;
      BigInteger sum = BigInteger.ZERO;
      for(int i=0; i<n; i++) {
        sum = sum.add(BigInteger.valueOf(arr[i]));
      }
      System.out.print(sum);
    }
}