import java.util.Scanner;

public class 1D_Array {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int[] arr = new int[n];
      for (int i=0; i<n; i++) {
         arr[i] = scn.nextInt();
      }
      func(arr, n, m);
    }
    
    public static void func(int[] arr, int n, int m) {
      int count = 0;
      for(int i=0; i<n; i++) {
        if (m == arr[i]) {
          count++;
        }
      }
      System.out.print(count);
    }
}