import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      scn.close();
      System.out.println(m%n == 0 ? "Yes" : "No");
  }
}