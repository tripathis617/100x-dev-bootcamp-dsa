import java.util.*;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int tests = scn.nextInt();
      for (int i=0; i<tests; i++) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int j=0; j<n; j++) {
          arr[j] = scn.nextInt();
        }
        arr = func(arr, n);
        print(arr, n);
      }
    }
    
    public static int[] func(int[] arr, int n) {
      for(int i=0; i<n-1; i+=2) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }
      return arr;
    }
    
    public static void print(int[] arr, int n) {
       for (int i=0; i<n; i++) {
         if (i==n-1) {
          System.out.print(arr[i]);
         } else {
          System.out.print(arr[i] + " ");
         }
      }
      System.out.println();
    }
}