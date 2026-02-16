import java.util.*;

public class 1D_Array {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int tests = scn.nextInt();
      for (int i=0; i<tests; i++) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int j=0; j<n; j++) {
          arr[j] = scn.nextInt();
        }
        func(arr, n);
      }
    }
    
    public static void func(int[] arr, int n) {
      for(int i=0; i<n; i++) {
        int idx = arr[i]%n;
        if (arr[idx]/n >= 1 ) {
          System.out.println(arr[i]%n);
          return;
        } else {
          arr[idx] = arr[idx] + n;  
        }
      }
    }
}