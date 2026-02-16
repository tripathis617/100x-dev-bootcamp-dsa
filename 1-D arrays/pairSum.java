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
        int k = scn.nextInt();
        func(arr, n, k);
      }
    }
    
    public static void func(int[] arr, int n, int k) {
      int count = 0;
      for(int i=0; i<n; i++) {
        int num = k-arr[i];
        for(int j=i+1; j<n; j++) {
          if (arr[j] == num) {
            count++;
          } 
        }
      }
      System.out.println(count);
    }
}