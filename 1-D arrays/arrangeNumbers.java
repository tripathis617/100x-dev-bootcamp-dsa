import java.util.*;

public class 1D_Array {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int tests = scn.nextInt();
      for (int j=0; j<tests; j++) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        arr = func(arr, n);
        print(arr, n);
      }
    }
    
    public static int[] func(int[] arr, int n) {
      int num = 1;
      for(int i=0; i<n/2; i++) {
        arr[i] = num;
        num++;
        arr[n-i-1] = num;
        num++;
      }
      if (n%2!=0) {
        arr[n/2] = n;    
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