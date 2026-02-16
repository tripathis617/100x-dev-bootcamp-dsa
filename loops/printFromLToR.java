import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn  = new Scanner(System.in);
    int l = scn.nextInt();
    int r = scn.nextInt();
    for (int i=l; i<=r; i++)  {
      if (i==r) {
        System.out.print(i);
      } else {
        System.out.print(i + " ");
      } 
    }
  }
}

