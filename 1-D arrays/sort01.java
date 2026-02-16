import java.util.*;

public class 1D_Array {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int tests = scn.nextInt();
      for (int j=0; j<tests; j++) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
           arr[i] = scn.nextInt();
        }
        arr = func(arr, n);
        print(arr, n);
      }
    }
    
    public static int[] func(int[] arr, int n) {
      int count = 0;
      for(int i=0; i<n; i++) {
        if (arr[i] == 0) {
          count++;
        }
      }
      for(int i=0; i<n; i++) {
        if (i <count) {
          arr[i] = 0;
        } else {
          arr[i] = 1;
        }
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