import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int[] arr = new int[3];
      arr[0] = scn.nextInt();
      arr[1] = scn.nextInt();
      arr[2] = scn.nextInt();
      scn.close();
      
      int max = arr[0];
      int min = arr[0];
      
      for (int i=0; i<arr.length; i++) {
        if (arr[i] > max) {
          max = arr[i];
        }
        if (arr[i] < min) {
          min = arr[i];
        }
      }
      System.out.println("Min = " + min);
      System.out.println("Max = " + max);
  }
}