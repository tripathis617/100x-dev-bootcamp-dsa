import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int x = scn.nextInt();
      int y = scn.nextInt();
      scn.close();
      
      if (x==0 && y==0) {
        System.out.println("Origin");
      } else if (x==0 && y!=0) {
        System.out.println("Y axis");
      } else if (x!=0 && y==0) {
        System.out.println("X axis");
      } else if (x>0 && y>0) {
        System.out.println("1st Quadrant");
      } else if (x>0 && y<0) {
        System.out.println("4th Quadrant");
      } else if (x<0 && y>0) {
        System.out.println("2nd Quadrant");
      } else if (x<0 && y<0) {
        System.out.println("3rd Quadrant");
      }
  }
}