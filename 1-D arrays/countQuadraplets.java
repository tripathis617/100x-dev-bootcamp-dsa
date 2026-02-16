import java.util.*;

public class Array_1D {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int[] arr = new int[n];
      for (int j=0; j<n; j++) {
        arr[j] = scn.nextInt();
      }
      func(arr, n, k);
    }
    
    public static void func(int[] arr, int n, int k) {
      int count = 0;
      for(int l=0; l<n; l++) {
        for(int m=l+1; m<n; m++) {
          for(int i=m+1; i<n; i++) {
            for(int j=i+1; j<n; j++) {
              if (arr[l] - 2*arr[m] + 3*arr[i] - 4*arr[j] == k) {
                // System.out.println("idx: " + l + " " + m + " " + i + " " + j);
                count++;
              } 
            }
          }
        }
      }
      System.out.println(count);
    }
}