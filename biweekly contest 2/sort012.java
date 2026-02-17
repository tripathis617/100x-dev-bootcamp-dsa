import java.util.*;

public class BiweeklyContest_2 {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int j=0; j<n; j++) {
        arr[j] = scn.nextInt();
      }
      func(arr, n);
      print(arr, n);
    }
    
    public static void func(int[] arr, int n) {
      int zeros = 0;
      int ones = 0;
      for(int i=0; i<n; i++) {
        if (arr[i] == 0) {
          zeros++;
        }
        if (arr[i] == 1) {
          ones++;
        }
      }
      for (int i=0; i<n; i++) {
        if (i<zeros) {
          arr[i] = 0;
        }
        if (i >= zeros && i < zeros + ones) {
          arr[i] = 1;
        } 
        if (i >= zeros && i >= zeros + ones)  {
          arr[i] = 2;
        } 
      }
    }
    
    public static void print(int[] arr, int n) {
      for(int i=n-1; i>=0; i--) {
        if (i==0) {
          System.out.print(arr[i]);
        } else {
          System.out.print(arr[i] + " ");
        }
      }
    }
}