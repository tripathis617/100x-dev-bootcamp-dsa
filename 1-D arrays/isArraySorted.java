import java.util.Scanner;

public class 1D_Array {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i=0; i<n; i++) {
         arr[i] = scn.nextInt();
      }
      func(arr, n);
    }
    
    public static void func(int[] arr, int n) {
      for(int i=0; i<n-1; i++) {
        if (arr[i] > arr[i+1]) {
          System.out.print("NO");
          return;
        }
      }
      System.out.print("YES");
    }
}