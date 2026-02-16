import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int n = scn.nextInt();
      scn.close();
      if (n%100==0 && n%400==0) {
        System.out.println("Yes"); 
      } else if (n%100!=0 && n%4==0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}