import java.util.*;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int tests = scn.nextInt();
      for (int i=0; i<tests; i++) {
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int j=0; j<n; j++) {
          arr1[j] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int j=0; j<m; j++) {
          arr2[j] = scn.nextInt();
        }
        func(arr1, n, arr2, m);
      }
    }
    
    public static void func(int[] arr1, int n, int[] arr2, int m) {
      for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
          if (arr2[j] == arr1[i]) {
            System.out.print(arr2[j] + " ");
            arr2[j] = -1;
            break;
          } 
        }
      }
      System.out.println();
    }
}