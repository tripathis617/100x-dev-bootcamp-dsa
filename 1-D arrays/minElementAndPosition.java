import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i=0; i<n; i++) {
         arr[i] = scn.nextInt();
      }
      func(arr);
    }
    
    public static void func(int[] arr) {
      int n = arr.length;
      int min = Integer.MAX_VALUE;
      int pos = 0;
      for(int i=0; i<n; i++) {
        if (min > arr[i]) {
          min = arr[i];
          pos = i+1;
        }
      }
      System.out.print(min + " " + pos);
    }
}