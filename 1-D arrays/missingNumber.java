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
        func(arr, n);
      }
    }
    
    public static void func(int[] arr, int n) {
      int res = 0;
      for(int i=0; i<n; i++) {
        res = res^arr[i];
      }
      System.out.println(res);
    }
}