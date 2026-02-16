import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      scn.close();
      if (n>=m) {
        System.out.println("Min = " + m);
        System.out.println("Max = " + n);  
      } else {
        System.out.println("Min = " + n);
        System.out.println("Max = " + m);
      }
      
  }
}