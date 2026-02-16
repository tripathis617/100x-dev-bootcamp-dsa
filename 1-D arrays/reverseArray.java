import java.util.*;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i=0; i<n; i++) {
         arr[i] = scn.nextInt();
      }
      arr = func(arr, n);
      print(arr, n);
    }
    
    public static int[] func(int[] arr, int n) {
      for(int i=0; i<n/2; i++) {
        int temp = arr[n-i-1];
        arr[n-i-1] = arr[i];
        arr[i] = temp;
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
    }
}